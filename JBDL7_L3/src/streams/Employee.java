package streams;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    String name;
    String email;
    double salary;

    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }



    @Override
    public int compareTo(Employee o) {
        return this.salary>o.salary?1:-1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
