package restaurant;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class Customer implements Runnable {
    BlockingDeque<Integer> blockingQueue;
    Random random = new Random();

    public Customer(BlockingDeque<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        int id = random.ints(4, 0, 10).findFirst().getAsInt();
        blockingQueue.add(id);
        System.err.println(id +"is added");

    }
}
