package restaurant;

import java.util.concurrent.Callable;

public class Machen implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for (int i = 0 ;i<10;i++){
            System.out.println(i+"=*"+Thread.currentThread());
            Thread.sleep(100);
        }
        return null;
    }
}
