package zoopackage.Zoo;

public abstract class Animal{
    private String name;
    private boolean isAsleep;
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
    
    public void wakeUp(){
        if(this.isAsleep){
            this.isAsleep = false;
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " woke up.");
        }
        else{
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is already awake.");
        }
        isAsleep = false;
    }
    //polymorphism -- in all other animal files
    public void makeNoise() {
        System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is making a noise.");
    
    }
    
    public void eat() {
        System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is eating.");
    
    }
    
    public void roam() {
        System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is roaming around.");
    
    }
    
    public void sleep() {
        if(!this.isAsleep){
            isAsleep = true;
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " has gone to sleep.");

        }
        else{
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is already asleep.");
        }
        
    }
}