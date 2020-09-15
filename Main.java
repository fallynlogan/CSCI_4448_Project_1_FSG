import zoopackage.*;
import java.io.File;
import java.io.IOException;


public class Main{
    private static int numDays = 0;
    public static void main(String[] args){
        Zoo ourZoo = new Zoo();
        for(int i = 0; i < ourZoo.all_animals.length; i++){
            System.out.println(ourZoo.all_animals[i].getName());
            System.out.println(numDays);
            numDays++;
        }
        //Creating output text file
        try {
            File file_name = new File("our_zoo.txt");
            if (file_name.createNewFile()) {
                System.out.println("File created: " + file_name.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}