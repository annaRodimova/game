import java.util.Random;

public class Person {
    String id;
    int number;
    public Person (String id) {
        this.id = id;
    }
    public Random r = new Random();
    public  int Numeral() {
        number = r.nextInt(100);
        return number;
    }
}
