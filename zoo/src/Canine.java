package zoo.src;

public class Canine extends Animal{
    public Canine(String[] name){
        super(name);
    }
    public void roam() {
        System.out.print(this.getName() + " is *WALKING*");
    }
}