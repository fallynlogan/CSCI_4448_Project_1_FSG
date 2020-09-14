package zoo.src;

public class Zookeeper {
    public void wakeAnimalUp(Zoo.Animal[] zoo) {
        System.out.println("Zookeeper begins to wake the animals up from their slumber.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].wakeup();
        }
    }
    public void makeAnimalSleep(Zoo.Animal[] zoo) {
        System.out.println("Zookeeper begins to wake the animals up from their slumber.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].sleep();
        }
    }
    public void rollCall(Zoo.Animal[] zoo) {
        System.out.println("Zookeeper begins to roll call the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].makeNoise();
        }
    }
    public void exerciseAnimal(Zoo.Animal[] zoo) {
        System.out.println("Zookeeper begins to exercise the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].roam();
        }
    }
}
