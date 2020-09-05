import java.io.BufferedReader;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Time1 {
    public static String generate_id(int size_of_id ){
        char create[] = new char[256];
        int j = 0;
        for(int i = -127 ; i <=128 ;i++){
            create[j] = (char)i;
            j++;
        }
        StringBuilder create_id = new StringBuilder();
        Random r = new Random();
        for(int i = 0 ; i < size_of_id ; i++){
            int index = r.nextInt(256);
            create_id.append(create[index]);
        }
        return create_id.toString();
    }
    public static  void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        long time = 0 ;
        Date date = new Date();
        long start = date.getTime();
        String id = generate_id(size);
        Date date2 = new Date();
        long end =date2.getTime();
        long finish = end - start ;
        time = finish;
        System.out.println(id);
        System.out.println(time);
    }

}