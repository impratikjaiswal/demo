package org.whl.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class TCPClientReadThread implements Runnable {

    private Selector selector;

    public TCPClientReadThread(Selector selector) {
        this.selector = selector;

        new Thread(this).start();
    }

    @Override
    public void run() {

        try {
            while (selector.select() > 0) {
                for (SelectionKey sk : selector.selectedKeys()) {
                    if (sk.isReadable()) {
                        SocketChannel sc = (SocketChannel) sk.channel();
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        sc.read(buffer);
                        buffer.flip();

                        String str =
                                Charset.defaultCharset().newDecoder().decode(buffer).toString();
                        System.out.println("Received msg: " + str);

                        sk.interestOps(SelectionKey.OP_READ);
                    }

                    selector.selectedKeys().remove(sk);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
