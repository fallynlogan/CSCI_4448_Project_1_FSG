package zoo.src;

//Canine extends animal
public class Cat extends Feline{
    public Cat(String[] name)
    {
        super(name);
    }
    public void roam() {
        System.out.print(this.getName() + " meows ");
    }
}