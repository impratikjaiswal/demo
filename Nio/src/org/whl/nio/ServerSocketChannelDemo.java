package org.whl.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class ServerSocketChannelDemo {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketCh = ServerSocketChannel.open();
        serverSocketCh.socket().bind(new InetSocketAddress(8080));
        serverSocketCh.configureBlocking(false);

        Selector selector = Selector.open();

        while (true) {
            SocketChannel socketChannel = serverSocketCh.accept();
            socketChannel.register(selector, SelectionKey.OP_READ);

            while (true) {
                int readyChannels = selector.select();
                if (readyChannels == 0) {
                    continue;
                }

                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> keyIter = selectionKeys.iterator();
                while (keyIter.hasNext()) {
                    SelectionKey key = keyIter.next();
                    if (key.isAcceptable()) {

                    }
                }
            }
        }
    }

}
