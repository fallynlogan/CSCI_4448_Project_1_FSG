package zoopackage;

public class Zookeeper extends Zooemployee {
    public Zookeeper(String name) {
        super(name);
    }

    public String exerciseAnimal(Animal[] zoo) {
        String str = this.getName() + " the Zookeeper begins to exercise the animals.";
        System.out.println(str);
        for(int i=0; i<zoo.length ; i++){
            zoo[i].roam();
        }
        return str;
    }
    public String feedAnimal(Animal[] zoo) {
        String str = this.getName() + "the Zookeeper begins to feed the animals.";
        System.out.println(str);
        for(int i=0; i<zoo.length ; i++){
            zoo[i].eat();
        }
        return str;
    }
}
