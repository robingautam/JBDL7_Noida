package join;

public class JoinExample extends Thread{


    public void run(){
        try {
            this.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
