package zoo.src;

//Note: Canine extends Animal class
/* Wolf Class
how to run: java main.java
*/
public class Wolf extends Canine{
    public Wolf(String name)
    {
        super(name);
    }
    public void makeNoise() {
        System.out.print(this.getName() + " BARKS!");
    }
}