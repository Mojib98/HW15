package restaurant;

import java.util.concurrent.*;

public class Cook implements Callable {
    Machen machen;
    ExecutorService pool = Executors.newFixedThreadPool(3);
    BlockingDeque<Integer> blockingDeque;


    public Cook(BlockingDeque<Integer> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    public Cook(Machen machen) {
        this.machen = machen;
    }

    @Override
    public Integer call() throws Exception {
        if (blockingDeque!=null){
            System.err.println("start to read "+Thread.currentThread()+" "+blockingDeque.poll());
        }
        System.out.println("we can "+Thread.currentThread());
        return 1;
    }
}
