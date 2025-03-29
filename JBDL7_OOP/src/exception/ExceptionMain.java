package exception;

public class ExceptionMain {
    public static void main(String[] args) throws Exception{

      /*  try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println();
        }
        catch (ArithmeticException exception){

        }
        System.out.println("program executed");*/

        /*int age = 10;
        try {
            if (age<18){
                throw new ArithmeticException("Age is not valid");
            }
            System.out.println("Voted");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured: "+e.getMessage());
        }*/

        System.out.println("program executed");


      /*  try {
            int a = 10/0;
        }
        catch (Exception exception){
            System.out.println("Exception");
        }
      /*  catch (ArithmeticException exception){
            System.out.println("Arithmetic Exception");  // not possible
        }
        */

     //   System.out.println(getExceptionOutput());
        /* try {
            someExceptionFunction();
        }
        catch (Exception ex){

        }*/

      //  someExceptionFunction();
        try {
            m3();
        }
        catch (Exception ex){

        }

        
    }


    public static int getExceptionOutput(){
        try {
            throw new ArithmeticException();
        }
        catch (Exception ex){
            return 2;
        }finally {
          //  return 3;
            System.out.println("Finally");
        }
    }


    public static void someExceptionFunction() throws Exception{
        System.out.println("Some code");
        int  a = 10/0;
        System.out.println(a);
    }

    public static void m1(){
        int  c = 10/0;
    }
    public static void m2(){
        m1();
    }
    public static void m3(){
        m2();
    }
}
