package zoopackage.Zoo;

public class Zookeeper extends Zooemployee {
    public Zookeeper(String name) {
        super(name);
	}

	public void exerciseAnimal(Animal[] zoo) {
        System.out.println(this.getName() + " the Zookeeper begins to exercise the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].roam();
        }
    }
    public void feedAnimal(Animal[] zoo) {
        System.out.println( this.getName() + "the Zookeeper begins to feed the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].eat();
        }
    }
}
