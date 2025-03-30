package abstractclass;

public class AbstractMain {

    public static void main(String[] args) {
        Animal animal = new AnimalImpl();
        animal.makeNoise();

        BankingClass bankingClass = new HDFCBank();
        System.out.println(bankingClass.getInterestRate());
    }
}
