public class MyThread extends Thread{


    @Override
    public void run()  {
        for (int i=1;i<=10;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
