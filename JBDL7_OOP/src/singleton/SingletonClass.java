package singleton;

public class SingletonClass {

    private static SingletonClass INSTANCE_my =null;

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if (INSTANCE_my ==null){
            INSTANCE_my = new SingletonClass();
        }
        return INSTANCE_my;
    }
}
