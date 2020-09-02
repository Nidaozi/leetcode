package NIOSTUDY;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class CompletableFutureTest {


    //    public static void main(String[] args) {
//        CompletableFuture<String> f0 = CompletableFuture.supplyAsync(
//                ()->"Hello"
//        ).thenApply(s -> s + " Nhw").thenApply(String::toUpperCase);
//
//        System.out.println(f0.join());
//
//    }
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool(4);
        Faboncci fib = new Faboncci(30);
        int result = fjp.invoke(fib);
        System.out.println(result);
    }
    static class Faboncci extends RecursiveTask<Integer>{
        final int n;
        Faboncci(int n ){
            this.n = n;
        }

        @Override
        protected Integer compute() {

            if(n<=1){
                return n;
            }
            Faboncci f1 = new Faboncci(n-1);
            f1.fork();
            Faboncci f2 = new Faboncci(n-2);
            return f2.compute()+f1.join();
        }
    }
}
