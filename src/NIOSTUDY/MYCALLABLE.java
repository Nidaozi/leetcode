package NIOSTUDY;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MYCALLABLE  implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {

        return null;
    }

    public static void main(String[] args) {
        MYCALLABLE bar = new MYCALLABLE();
        FutureTask<Integer> foo= new FutureTask<Integer>(bar);
        
        new Thread(foo).start();
    }
}
