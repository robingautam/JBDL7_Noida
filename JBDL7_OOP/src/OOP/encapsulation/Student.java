package OOP.encapsulation;

public class Student {
    int id;
    String name;
    private int age;

    Student(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            return;
        }
        this.age = age;
    }
}
