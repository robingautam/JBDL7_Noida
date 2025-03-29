package exceptionRelationship;

import java.io.IOException;

public class Child extends Parent{

    @Override
    public void someMethod() throws IOException {

    }

    @Override
    public void someMethod_2() throws ArithmeticException{

    }
}
