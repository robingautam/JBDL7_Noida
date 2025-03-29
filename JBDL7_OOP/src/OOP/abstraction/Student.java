package OOP.abstraction;

public class Student {
    int id;
    String name;

    public void validateStudent(int id, String name){
        validateId(id);
        validateName(name);
    }

    private void validateId(int id){
        System.out.println("Validating the id");
    }

    private void validateName(String name){
        System.out.println("validating the name");
    }
}
