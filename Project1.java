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

    public static int getNumOfInstances() {
        return counter;
    }
    private static int counter = 0;
    //2
    class Animal {
        string name = "";
        bool isAwake = false;
        bool isAsleep = false;
        
        public string getName(String[] args){
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

    //2
    class Zookeeper {
        public void wakeAnimalUp(Animal args) {
            System.out.println("Zookeeper wakes up " + Animal.getName());
        }
        public void rollCall() {
           int count = getNumOfInstances();
           System.outprintln("The number of animals in the zoo today is" + count);
        }
        public void feedAnimal() {
            
        }
        public void exerciseAnimal(Animal[] zoo) {
            for (int i = 0; i < zoo.length; i++) {
                zoo[i].roam();
            }
        }
        public void makeAnimalSleep(Animal[] zoo) {
            for (int i = 0; i < zoo.length; i++) {
                System.out.println("Goodnight " + zoo[i].getName());
                zoo[i].sleep();
            }
        }
    }
    
}