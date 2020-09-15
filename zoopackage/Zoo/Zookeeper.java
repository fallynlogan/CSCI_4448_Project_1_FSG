package zoopackage.Zoo;

public class Zookeeper extends Zooemployee {
    public void exerciseAnimal(Animal[] zoo) {
        System.out.println("Zookeeper begins to exercise the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].roam();
        }
    }
    public void feedAnimal(Animal[] zoo) {
        System.out.println("Zookeeper begins to feed the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].eat();
        }
    }
}
