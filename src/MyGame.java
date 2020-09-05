import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MyGame {
    public static void main(String args[]) {
        Person Alex = new Person("Alex");
        Person Anna = new Person("Anna");
        Person Max = new Person("Max");
        Person Michail = new Person("Michail");
        Person Sergey = new Person("Sergey");
        ArrayList<Person> massiv = new ArrayList<>(5);
        massiv.add(Alex);
        massiv.add(Anna);
        massiv.add(Max);
        massiv.add(Michail);
        massiv.add(Sergey);
        for (int y = 0; y < 4; y++) {
        ArrayList<Integer> NUM = new ArrayList<>(massiv.size());
        for (int i = 0; i < massiv.size(); i++) {
            NUM.add(massiv.get(i).Numeral());

        }
        Collections.sort(NUM);
        for(int i = 0 ; i< massiv.size(); i++){
            System.out.println(massiv.get(i).name + " " + massiv.get(i).number);
        }
        for (int i = 0; i < massiv.size(); i++) {
            if (massiv.get(i).number == NUM.get(0)) {
                System.out.println(massiv.get(i).name + " Вы самое слабое звено, прощайте ");
                massiv.remove(i);
            }
        }
        }
        System.out.println(massiv.get(0).name + " Огонь, ты побелил");
    }

}