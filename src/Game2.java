import java.util.*;

public class Game2 {
    public static void main(String args[]) {
        Person Alex = new Person("Alex000");
        Person Anna = new Person("Anna111");
        Person Michail = new Person("Michail222");
        ArrayList<Person> PERSONS = new ArrayList<>(Arrays.asList(Alex, Anna, Michail)); // добавили сразу всех игроков
        ArrayList<Integer> loterry = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            loterry.add(i);
        }
        int x = 0;
        int temp = 0;
        Date data1 = new Date();
        System.out.println(data1.getTime());
        do {
            Collections.shuffle(loterry);
            Random b = new Random();
            int num = b.nextInt(99);
            x = loterry.get(num);
            for (int i = 0; i < 3; i++) {
                PERSONS.get(i).Numeral();
            }
            temp++;
            System.out.println(temp);
        }
        while (PERSONS.get(0).number != x || PERSONS.get(1).number != x || PERSONS.get(2).number != x);
        Date data2 = new Date();
        System.out.println(data2.getTime());
    }
}

