package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableMain {

    public static void main(String[] args) {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("inside the thread");
                return -1;
            }
        };

        Future<Integer> future = new FutureTask<>(callable);
        future.cancel(true);
    }
}
