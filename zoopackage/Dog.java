package zoopackage;

//Canine extends animal
public class Dog extends Canine{
    public Dog(String name)
    {
        super(name);
    }
    public void roam() {
        //When a Dog is given the exercise command by the Zookeeper,there is a 25% chance the dog will dig instead of roaming.
        if (0 < rand && rand< 25) {
            dig(); 
        }
        else {
            System.out.print(this.getName() + " is wagging their tail & running ");
        }
    }
    public void dig() {
        System.out.print(this.getName() + " is digging");
    }
}