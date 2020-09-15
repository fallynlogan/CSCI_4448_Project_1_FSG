package zoopackage;

public class Pachyderm extends Animal{
    public Pachyderm(String name)
    {
        super(name);
    }
    public void roam() {
        System.out.println(this.getName() + " is *STOMPING*");
    }
}