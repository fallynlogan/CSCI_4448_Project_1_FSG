package zoo.src;

public class Animal{
    private String name;
    private boolean isAsleep = false;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void wakeUp(){
        isAsleep = false;
    }
    
    public void makeNoise() {
    
    }
    
    public void eat() {
    
    }
    
    public void roam() {
    
    }
    
    public void sleep() {
        isAsleep = true;
    }
}