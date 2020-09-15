import zoopackage.*;

public class Main{
    private static int numDays = 0;
    public static void main(String[] args){
        Zoo ourZoo = new Zoo();
        for(int i = 0; i < ourZoo.all_animals.length; i++){
            System.out.println(ourZoo.all_animals[i].getName());
            System.out.println(numDays);
            numDays++;
        }
    }
}