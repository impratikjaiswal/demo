package org.whl.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

public class TCPClient {

    private Selector selector;

    SocketChannel socketChannel;

    private String ip;

    private int port;

    public TCPClient(String ip, int port) throws IOException {
        this.ip = ip;
        this.port = port;
        initialize();
    }

    private void initialize() throws IOException {
        socketChannel = SocketChannel.open(new InetSocketAddress(this.ip, this.port));
        socketChannel.configureBlocking(false);
    }

    public void sendMsg(String msg) throws IOException {
        ByteBuffer writeBuffer = ByteBuffer.wrap(msg.getBytes());
        socketChannel.write(writeBuffer);
    }

    public static void main(String[] args) throws IOException {
        TCPClient client = new TCPClient("127.0.0.1", 8080);

        client.sendMsg("Hello NIO...");
    }

}
