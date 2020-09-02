package NIOSTUDY;

import java.nio.IntBuffer;

public class UseBuffer {
    static IntBuffer intBuffer = null;
    public static void allocatTest(){
        intBuffer = IntBuffer.allocate(20);
        System.out.println("------allocate-----------");
        System.out.println("position = "+intBuffer.position());
        System.out.println("limit = "+intBuffer.limit());
        System.out.println("capacity = "+intBuffer.capacity());
    }
    public static void putTest(){
        for (int i = 0; i < 5; i++) {
            intBuffer.put(i);
        }
        System.out.println("------put-----------");
        System.out.println("position = "+intBuffer.position());
        System.out.println("limit = "+intBuffer.limit());
        System.out.println("capacity = "+intBuffer.capacity());
    }
    public static void flipTest(){
        intBuffer.flip();
        System.out.println("------flipTest-----------");
        System.out.println("position = "+intBuffer.position());
        System.out.println("limit = "+intBuffer.limit());
        System.out.println("capacity = "+intBuffer.capacity());
    }
    public static void getTest(){
        for (int i = 0; i < 2; i++) {
            int j = intBuffer.get();
        }
        System.out.println("------get 2 number-----------");
        System.out.println("position = "+intBuffer.position());
        System.out.println("limit = "+intBuffer.limit());
        System.out.println("capacity = "+intBuffer.capacity());
        for (int i = 0; i < 3; i++) {
            int j = intBuffer.get();
        }
        System.out.println("------get 3 number-----------");
        System.out.println("position = "+intBuffer.position());
        System.out.println("limit = "+intBuffer.limit());
        System.out.println("capacity = "+intBuffer.capacity());
        intBuffer.rewind();
        System.out.println("---------rewind--------------");
        System.out.println("position = "+intBuffer.position());
        System.out.println("limit = "+intBuffer.limit());
        System.out.println("capacity = "+intBuffer.capacity());

        intBuffer.clear();

    }
    public static void main(String[] args) {
        allocatTest();
        putTest();
        flipTest();
        getTest();
    }
}
