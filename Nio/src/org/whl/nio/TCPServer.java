package org.whl.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;

public class TCPServer {

    private static final int BufferSize = 1024;

    private static final int TimeOut = 3000;

    private static final int ListenPort = 8080;

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();

        ServerSocketChannel serverCh = ServerSocketChannel.open();

        serverCh.socket().bind(new InetSocketAddress("127.0.0.1", ListenPort));
        serverCh.configureBlocking(false);

        serverCh.register(selector, SelectionKey.OP_ACCEPT);

        ITCPProtocol protocol = new TCPProtocolImpl(BufferSize);

        while (true) {
            if (selector.select(TimeOut) == 0) {
                System.out.println("Waiting alonely...");
                continue;
            }

            Iterator<SelectionKey> keyIter = selector.selectedKeys().iterator();

            while (keyIter.hasNext()) {
                SelectionKey key = keyIter.next();

                try {
                    if (key.isAcceptable()) {
                        protocol.handleAccept(key);
                    }
                    if (key.isReadable()) {
                        protocol.handleRead(key);
                    }

                    if (key.isValid() && key.isWritable()) {
                        protocol.handleWrite(key);
                    }
                } catch (IOException e) {
                    keyIter.remove();
                    continue;
                }

                keyIter.remove();
            }
        }

    }

}
