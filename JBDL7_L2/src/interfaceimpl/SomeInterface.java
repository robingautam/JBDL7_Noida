package interfaceimpl;

public interface SomeInterface {

     void someMethod();

     void soemMethod2();

     default void  someDefaultMethod(){
         System.out.println("Default body");
     }

     private void privateMethod(){
         System.out.println("Some private method");
     }
}
