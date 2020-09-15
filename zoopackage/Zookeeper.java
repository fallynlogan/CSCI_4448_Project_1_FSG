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

    public int rand = randomInt(); 

    public String exerciseAnimal(Animal[] zoo) {
        String str = this.getName() + " the Zookeeper begins to exercise the animals.";
        System.out.println(str);
        for(int i=0; i<zoo.length ; i++){
            if(zoo[i].getClass().getSimpleName() == "Dog") {
                //there is a 25% chance the dog will dig instead of roaming. 
                if(0 < rand && rand < 25) {
                    zoo[i].dig();
                } else {
                    zoo[i].roam();
                }
            } 
            else if (zoo[i].getClass().getSimpleName() == "Pachyderm") {
                //there is a 25% chance the Pachyderm will charge instead of roaming. 
                if(0 < rand && rand < 25) {
                    zoo[i].charge();
                } else {
                    zoo[i].roam();
                }
            }
            else {
            zoo[i].roam();
            }
        }
        return str;
    }
    public String feedAnimal(Animal[] zoo) {
        String str = this.getName() + "the Zookeeper begins to feed the animals.";
        System.out.println(str);
        for(int i=0; i<zoo.length ; i++){
            zoo[i].eat();
        }
        return str;
    }

}
