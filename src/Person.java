import java.util.Random;

public class Person {
    String name;
     public Random b = new Random();
    public int number;
    public Person (String name) {
        this.name = name;
    }
    public int Numeral() {
        number = b.nextInt(100);
        return number;
    }
}
