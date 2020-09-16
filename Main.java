import zoopackage.*;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Main {
    private static int numDays = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of days for the zoo to operate: ");
        numDays = sc.nextInt();
        sc.close();

        Zoo ourZoo = new Zoo(numDays);
        PrintStream fileName;
        try {
            fileName = new PrintStream("our_zoo.txt");
            System.setOut(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // for(int i = 0; i < ourZoo.all_animals.length; i++) {
        //     System.out.println(ourZoo.all_animals[i].getName());
        //     System.out.println(i);
        // }
    }
}