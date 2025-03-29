public class Person {
    int id;
    String name;
    String email;

    static String collegeName = "GGSIPU";

    public Person(String name, String email){
        this(1);
        this.name = name;
        this.email = email;
        takeParameter(this);
    }

    public Person(int id){
        this.id = id;
    }

    public void takeParameter(Person person){
        System.out.println("Person is taken");
    }


    @Override
    public String toString(){
      String printable = "id: "+this.id+" , Name: "+this.name+" , Email: "+this.email;
      return printable;

    }

}
