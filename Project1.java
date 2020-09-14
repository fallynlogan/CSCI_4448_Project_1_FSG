//CSCI 4448 Project 1
//Garrett Hempy
//Fallyn Logan
//Serena Evans-Lutterodt

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}

//1
class Zoo {
    
    int numDays = 0;
    
    //2
    class Animal {
        private String name = "";
        private boolean isAsleep = false;
        
        public String getName(){
            return name;
        }

        public void sleep() {
            isAwake = false;
            isAsleep = true;
        }

        public void wakeup(){
            isAwake = true;
            isAsleep = false;
        } 

        //3
        class Pachyderm {

            public void roam() {
                System.out.print("is *STOMPING*");
            }
            //4
            class Hippo {
                public void makeNoise() {
                    System.out.println("*Splashes Around*");
                }
            }
            //4
            class Elephant {
                public void makeNoise() {
                    System.out.println("OOOOOOOOONJBmkndjsnfjsOJDS");
                }
            }
            //4
            class Rhino {
                public void makeNoise() {
                    System.out.println("OOOOOOO");
                }
            }
        }
        //3
        class Feline {

            public void roam() {
                System.out.print("is *RUNNING*");
            }
            //4
            class Tiger {
                public void makeNoise() {
                    System.out.println("roar");
                }
            }
            //4
            class Lion {
                public void makeNoise() {
                    System.out.println("ROAR");
                }
            }
            //4
            class Leopard {
                public void makeNoise() {
                    System.out.println("GROWL");
                }
            }
        }
        //3
        class Canine {

            public void roam() {
                System.out.print("is *WALKING*");
            }
            //4
            class Wolf {
                public void makeNoise() {
                    System.out.println("BARK!");
                }
            }
            //4
            class Dog {
                public void makeNoise() {
                    System.out.println("bark");
                }
            }
        }
    }
}


class ZooEmployee{
    class ZooKeeper {
        public void wakeAnimalUp(Zoo.Animal[] zoo) {
            System.out.println("Zookeeper begins to wake the animals up from their slumber.");
            for(int i=0; i<zoo.length() ; i++){
                //zoo[i].makeNoise();
            }
        }
        public void rollCall(Zoo.Animal[] zoo) {
            System.out.println("Zookeeper begins to roll call the animals.");
            for(int i=0; i<zoo.length() ; i++){
                //zoo[i].makeNoise();
            }
        }
        public void feedAnimal(Zoo.Animal[] zoo) {
            System.out.println("Zookeeper begins to feed the animals.");
            for(int i=0; i<zoo.length() ; i++){
                //zoo[i].makeNoise();
            }
        }
        public void exerciseAnimal(Zoo.Animal[] zoo) {
            System.out.println("Zookeeper begins to exercise the animals.");
            for(int i=0; i<zoo.length() ; i++){
                //zoo[i].makeNoise();
            }
        }
        public void makeAnimalSleep(Zoo.Animal[] zoo) {
            System.out.println("Zookeeper begins to wake the animals up from their slumber.");
            for(int i=0; i<zoo.length() ; i++){
                //zoo[i].makeNoise();
            }
        }
    }
}



