package org.whl.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Date;

public class TCPProtocolImpl implements ITCPProtocol {

    private int bufferSize;

    public TCPProtocolImpl(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    @Override
    public void handleAccept(SelectionKey key) throws IOException {
        SocketChannel clientChannel = ((ServerSocketChannel) key.channel()).accept();
        clientChannel.configureBlocking(false);
        clientChannel.register(key.selector(), SelectionKey.OP_READ,
                ByteBuffer.allocate(bufferSize));
    }

    @Override
    public void handleRead(SelectionKey key) throws IOException {
        SocketChannel clientChannel = (SocketChannel) key.channel();

        ByteBuffer buffer = (ByteBuffer) key.attachment();
        buffer.clear();

        long bytesRead = clientChannel.read(buffer);
        if (bytesRead == -1) {
            clientChannel.close();
        } else {
            buffer.flip();
            String receivedMsg = Charset.defaultCharset().decode(buffer).toString();

            System.out.println("Received msg from "
                    + clientChannel.socket().getRemoteSocketAddress() + " : " + receivedMsg);

            String sendMsg =
                    "Hello, client[@" + new Date().toString() + "], has received you msg: "
                            + receivedMsg;
            buffer = ByteBuffer.wrap(sendMsg.getBytes());
            clientChannel.write(buffer);

            key.interestOps(SelectionKey.OP_READ | SelectionKey.OP_WRITE);
        }
    }

    @Override
    public void handleWrite(SelectionKey key) throws IOException {
        // do nothing.

    }

}
