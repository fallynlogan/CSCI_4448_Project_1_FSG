package zoopackage;

public abstract class Zooemployee {
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
            zoo[i].wakeup();
        }
    }
    public void makeAnimalSleep(Animal[] zoo) {
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " begins to tuck the animals in for the night.");
        for(int i=0; i<zoo.length ; i++){
            if(zoo[i].getClass().getSimpleName() == "Feline") {
                //There is a 30% chance the Feline will roam instead of sleeping

            }
            zoo[i].sleep();
        }
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