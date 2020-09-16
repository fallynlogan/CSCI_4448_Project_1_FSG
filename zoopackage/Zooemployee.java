package zoopackage;

<<<<<<< HEAD
//This is an example of an Abstract class 
//This is abstract because you cannot create an instance of it. It can only be used to create subclasses (such as zookeeper)
=======
//Example of Abstract class in line 4, "public abstract class Zooemployee"
>>>>>>> 63aa7b529da028c82d927bd8a7d4b6a80c5f897a
public abstract class Zooemployee {
    //Encapsulation regarding line 5, "private String name;" 
    //This is Encapsulation because we are hiding the variable so that other classes cannot access its value directly, there must be getters and setters.
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
    //Abstraction example: These are not defined within zoo employee because they are actions specific to zookeeper. So they are defined here because zookeeper in a subclass of zooemployee so it must have these abstract methods
    //This is an example of Abstraction because "shows" only necessary info and "hides" unnecessary info
    public abstract void exerciseAnimal(Animal[] zoo);
    public abstract void feedAnimal(Animal[] zoo);
}