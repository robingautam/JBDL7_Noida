package thread;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Runnable mythread = new MyThreadUsingRunnable();
        Thread thread = new Thread(mythread);
        thread.join();
        thread.start();
    }
}
