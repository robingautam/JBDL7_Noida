public class Arithm extends Thread{

    @Override
    public void run() {
        System.out.println(10/0);
    }
}
