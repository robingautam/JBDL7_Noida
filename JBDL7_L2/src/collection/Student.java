package collection;

public class Student implements Comparable<Student> {
    int id;
    String name;
    String rollNo;

    public Student(int id, String name, String rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}
