package zoopackage;

//Canine extends animal
public class Cat extends Feline{
    public Cat(String name)
    {
        super(name);
    }
    public void roam() {
        System.out.println(this.getName() + " meows");
    }
}