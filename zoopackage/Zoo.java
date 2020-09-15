package zoopackage;

import java.io.File;
import java.io.IOException;
import java.io.*;

public class Zoo{
    public Zookeeper keeper;
    public Animal[] all_animals;

    public Zoo(int numDays){
        keeper = new Zookeeper("Zach");
        all_animals = new Animal[20];
        Alligator allison = new Alligator("Allison");
        Alligator abraham = new Alligator("Abraham");
        Dog dale = new Dog("Dale");
        Dog daisy = new Dog("Daisy");
        Elephant edward = new Elephant("Edward");
        Elephant ellie = new Elephant("Ellie");
        Hippo harriet = new Hippo("Harriet");
        Hippo harrison = new Hippo("Harrison");
        Leopard lenny = new Leopard("Lenny");
        Leopard lydia = new Leopard("Lydia");
        Rhino rebecca = new Rhino("Rebecca");
        Rhino ron = new Rhino("Ron");
        Snake sally = new Snake("Sally");
        Snake sergio = new Snake("Sergio");
        Tiger tony = new Tiger("Tony");
        Tiger taryn = new Tiger("Taryn");
        Wolf willie = new Wolf("Willie");
        Wolf wendy = new Wolf("Wendy");
        Cat cathy = new Cat("Cathy");
        Cat clayton = new Cat("Clayton");

        all_animals[0] = allison;
        all_animals[1] = abraham;
        all_animals[2] = cathy;
        all_animals[3] = clayton;
        all_animals[4] = dale;
        all_animals[5] = daisy;
        all_animals[6] = edward;
        all_animals[7] = ellie;
        all_animals[8] = harriet;
        all_animals[9] = harrison;
        all_animals[10] = lenny;
        all_animals[11] = lydia;
        all_animals[12] = rebecca;
        all_animals[13] = ron;
        all_animals[14] = sally;
        all_animals[15] = sergio;
        all_animals[16] = tony;
        all_animals[17] = taryn;
        all_animals[18] = willie;
        all_animals[19] = wendy;

        try {
            File file_name = new File("our_zoo.txt");
            if (file_name.createNewFile()) {
                System.out.println("File created: " + file_name.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //W3 Schools Write to a File: https://www.w3schools.com/java/java_files_create.asp

        for(int i=1; i<=numDays ; i++){
            //TASKS FOR EACH DAY
            //Wake the animals
            String wake_up = keeper.wakeAnimalUp(all_animals);
            //Roll call the animals
            String roll_call = keeper.rollCall(all_animals);
            //Feed the animals
            String feed_animal = keeper.feedAnimal(all_animals);
            //Exercise the animals
            String exer_animal = keeper.exerciseAnimal(all_animals);
            //Put animals to sleep
            String sleep_animal = keeper.makeAnimalSleep(all_animals);

            try {
                FileWriter myWriter = new FileWriter("our_zoo.txt");
                myWriter.write();
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }

    }
}