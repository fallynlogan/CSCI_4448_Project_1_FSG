package zoopackage;

public abstract class Zooemployee {
    //Encapsulation regarding line 5, "private String name;"
    private String name;
    public Zooemployee(String name){
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void wakeAnimalUp(Animal[] zoo) {
        String str = this.name + " the " + this.getClass().getSimpleName() + " begins to wake the animals up from their slumber.";
        System.out.println(str);
        for(int i=0; i<zoo.length ; i++){
            //Polymorphism example #1
            zoo[i].wakeup();
        }
    }
    public void makeAnimalSleep(Animal[] zoo) {
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " begins to tuck the animals in for the night.");
        for(int i=0; i<zoo.length ; i++){
            //Polymorphism example #2
            zoo[i].sleep();
        }
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " locks up and closes the zoo for the night.");
    }
    public void rollCall(Animal[] zoo) {
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " begins to roll call the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].makeNoise();
        }
    }
    public abstract void exerciseAnimal(Animal[] zoo);
    public abstract void feedAnimal(Animal[] zoo);
}