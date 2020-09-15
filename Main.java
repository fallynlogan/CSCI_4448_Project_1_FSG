import zoopackage.*;
import java.io.File;
import java.io.IOException;
import java.util.*;


public class Main{
    private static int numDays = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of days for the zoo to operate: ");
        numDays = sc.nextInt();

        Zoo ourZoo = new Zoo(numDays);

        for(int i = 0; i < ourZoo.all_animals.length; i++) {
            System.out.println(ourZoo.all_animals[i].getName());
            System.out.println(i);
        }
    }
}