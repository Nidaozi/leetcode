package NIOSTUDY;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class TestChannel {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 1237));
        while (! socketChannel.finishConnect()){
            //不断的自旋,等待,或者其他事情
            System.out.println("hello"+System.currentTimeMillis());
        }
    }
}
