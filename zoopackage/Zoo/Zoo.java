package zoopackage.Zoo;

public class Zoo {
    public Zookeeper keeper;
    public Animal[] animals;

    public Zoo(){
        keeper = new Zookeeper("Zach");
        animals = new Animal[11];
        animals[0] = new Alligator("Alex");
        animals[1] = new Cat("Cathy");
        animals[2] = new Dog("Doug");
        animals[3] = new Elephant("Elizabeth");
        animals[4] = new Hippo("Harry");
        animals[5] = new Leopard("Larry");
        animals[6] = new Lion("Leon");
        animals[7] = new Reptile("Rhonda");
        animals[8] = new Snake("Sally");
        animals[9] = new Tiger("Tony");
        animals[10] = new Wolf ("William"); 
    }
}