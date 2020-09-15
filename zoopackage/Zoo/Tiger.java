package zoopackage.Zoo;

public class Tiger  extends Feline{
    public Tiger(String name)
    {
        super(name);
    }
    public void makeNoise() {
        System.out.print(this.getName() + " roar");
    }
}