package org.gfg.model;
// Bean or POJO
public class Employee {

    int id;
    String name;
    String email;


   public Employee(){

    }

    public Employee(String name, int id, String email) {
        System.out.println("Inside the constructor 2");
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Employee(int id, String name, String email) {
        System.out.println("Inside the constructor 1");
        this.id = id;
        this.name = name;
        this.email = email;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("inside the setter method with value : "+id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("inside the setter method with value : "+name);
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("inside the setter method with value : "+email);
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
