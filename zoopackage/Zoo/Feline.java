package zoopackage.Zoo;

public class Feline extends Animal{
    public Feline(String name)
    {
        super(name);
    }
    public void roam() {
        System.out.print(this.getName() + " is *RUNNING*");
    }
}