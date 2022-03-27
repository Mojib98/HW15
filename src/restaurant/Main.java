package restaurant;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
    ExecutorService pool = Executors.newFixedThreadPool(3);
        Machen Ma= new Machen();
        Cook c=new Cook(blockingDeque);
        Customer customer = new Customer(blockingDeque);

       // Future<Integer> future3 = pool.submit(c);
        //Future<Integer> future2 = pool.submit(c);
        for (int i = 0;i<40;i++) {
            pool.submit(customer);
            Future<Integer> future = pool.submit(c);
        }


    }
}
