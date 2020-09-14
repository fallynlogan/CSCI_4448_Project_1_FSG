package zoo.src;

public class Pachyderm extends Animal{
    public Pachyderm(String name)
    {
        super(name);
    }
    public void roam() {
        System.out.print(this.getName() + " is *STOMPING*");
    }
}