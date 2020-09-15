package zoopackage.Zoo;

public class Main{
    private static int numDays = 0;
    public static void main(String[] args){
        Zoo ourZoo = new Zoo();
        for(int i = 0; i < ourZoo.animals.length; i++){
            System.out.println(ourZoo.animals[i].getName());
            System.out.println(numDays);
            numDays++;
        }
        
    }
}