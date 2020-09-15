package zoopackage;

public class Zookeeper extends Zooemployee {
    public void wakeAnimalUp(Animal[] zoo) {
        System.out.println("Zookeeper begins to wake the animals up from their slumber.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].wakeup();
        }
    }
    public void makeAnimalSleep(Animal[] zoo) {
        System.out.println("Zookeeper begins to wake the animals up from their slumber.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].sleep();
        }
    }
    public void rollCall(Animal[] zoo) {
        System.out.println("Zookeeper begins to roll call the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].makeNoise();
        }
    }
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
