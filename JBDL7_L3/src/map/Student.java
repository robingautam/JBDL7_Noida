package map;

public class Student {

    int id;
    String name;
    String email;

    public Student(){}

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        return this.id+this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Student st = (Student) obj;
       return st.id==this.id && st.name.equals(this.name);
    }
}
