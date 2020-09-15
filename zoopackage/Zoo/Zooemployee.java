package zoopackage.Zoo;

public abstract class Zooemployee {
    public void wakeAnimalUp(Animal[] zoo) {
        System.out.println(this.getClass().getSimpleName() + " begins to wake the animals up from their slumber.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].wakeUp();
        }
    }
    public void makeAnimalSleep(Animal[] zoo) {
        System.out.println(this.getClass().getSimpleName() + "begins to tuck the animals in for the night.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].sleep();
        }
    }
    public void rollCall(Animal[] zoo) {
        System.out.println("begins to roll call the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].makeNoise();
        }
    }
    public abstract void exerciseAnimal(Animal[] zoo);
    public abstract void feedAnimal(Animal[] zoo);
}