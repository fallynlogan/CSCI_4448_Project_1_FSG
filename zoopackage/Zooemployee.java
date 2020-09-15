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
    public String wakeAnimalUp(Animal[] zoo) {
        String str = this.name + "the" + this.getClass().getSimpleName() + " begins to wake the animals up from their slumber.";
        System.out.println(str);
        for(int i=0; i<zoo.length ; i++){
            zoo[i].wakeup();
        }
        return str;
    }
    public String makeAnimalSleep(Animal[] zoo) {
        String str = this.name + "the" + this.getClass().getSimpleName() + "begins to tuck the animals in for the night.";
        System.out.println(str);
        for(int i=0; i<zoo.length ; i++){
            if(zoo[i].getClass() == "Feline") {
                //There is a 30% chance the Feline will roam instead of sleeping

            }
            zoo[i].sleep();
        }
        return str;
    }
    public String rollCall(Animal[] zoo) {
        String str = this.name + "the" + this.getClass().getSimpleName() + "begins to roll call the animals.";
        System.out.println(str);
        for(int i=0; i<zoo.length ; i++){
            zoo[i].makeNoise();
        }
        return str;
    }
    public abstract String exerciseAnimal(Animal[] zoo);
    public abstract String feedAnimal(Animal[] zoo);
}