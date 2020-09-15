package zoopackage;
import java.util.Random;

public class Animal{
    private String name;
    private boolean isAsleep;
    public int rand = randomInt();
   //Original fucn: private boolean isAsleep = false;

   //constructor
   public Animal(String name){
       this.name = name;
       this.isAsleep = true;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int randomInt(){
        int max = 100;
        int min = 1;
        Random randomNum = new Random();
        int randomNumber = min + randomNum.nextInt(max);
        return(randomNumber);
    }
    
    public void wakeup(){
        if(this.isAsleep){
            this.isAsleep = false;
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " woke up.");
        }
        else{
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is already awake.");
        }
        isAsleep = false;
    }
    
    public void makeNoise() {
        System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is making a noise.");
    
    }
    
    public void eat() {
        System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is eating.");
    
    }
    
    public void roam() {
        //When a Dog is given the exercise command by the Zookeeper,there is a 25% chance the dog will dig instead of roaming.
        if (this.getClass().getSimpleName() == "Dog") {
            if (0 < rand && rand< 25) {
                dig(); 
            }
        } //When a Pachyderm is given an exercise command, there is a 25% chance it will charge instead of roam.
        else if (this.getClass().getSimpleName() == "Pachyderm")  {//test this 
            if (0 < rand && rand< 25) {
                charge(); 
            }
        } else {
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is roaming around.");
        }
    }
    
    public void sleep() {
        if(!this.isAsleep){
            if(this.getClass().getSimpleName() == "Cat" || this.getClass().getSimpleName() == "Lion" || this.getClass().getSimpleName() == "Leopard") { //test this
                System.out.println("This is a feline");
                //When a Feline is given a sleep command, there is a 30% chance it will roam instead, a 30% chance it will make noise, and a 40% chance it will sleep. 
                if (0 < rand && rand < 30) {
                    roam();
                } else if (30 < rand && rand < 60) {
                    makeNoise();
                }
            } else {
                isAsleep = true;
                System.out.println(this.name + " the " +this.getClass().getSimpleName() + " has gone to sleep.");
            }
        }
        else{
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is already asleep.");
        }
        
    }

    public void dig(){
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + "is digging");
    }

    public void charge() {
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + "is charging");
    }
}