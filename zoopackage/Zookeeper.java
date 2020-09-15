package zoopackage;
import java.util.Random;

public class Zookeeper extends Zooemployee {
    public Zookeeper(String name) {
        super(name);
    }

    public int randomInt(){
        int max = 100;
        int min = 1;
        Random randomNum = new Random();
        int randomNumber = min + randomNum.nextInt(max);
        return(randomNumber);
    }

    public void exerciseAnimal(Animal[] zoo) {
        System.out.println(this.getName() + " the Zookeeper begins to exercise the animals.");
        for(int i=0; i<zoo.length ; i++){
            if(zoo[i].getClass().getSimpleName() == "Dog") {
                //there is a 25% chance the dog will dig instead of roaming. 
                if(){
                    zoo[i].dig();
                } else {

                }
            } 
            else {
            zoo[i].roam();
            }
        }
    }
    public void feedAnimal(Animal[] zoo) {
        System.out.println( this.getName() + "the Zookeeper begins to feed the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].eat();
        }
    }
}
