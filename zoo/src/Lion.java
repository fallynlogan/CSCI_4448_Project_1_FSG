package zoo.src;

public class Lion extends Feline{
    public Lion(String name)
    {
        super(name);
    }
    public void makeNoise() {
        System.out.print(this.getName() + " ROAR");
    }
}