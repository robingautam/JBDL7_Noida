package singleton;

public class SingleMain {

    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        System.out.println(singletonClass.hashCode());
        System.out.println(singletonClass1.hashCode());
        System.out.println(SingletonClass.getInstance().hashCode());
        System.out.println(SingletonClass.getInstance().hashCode());
    }
}
