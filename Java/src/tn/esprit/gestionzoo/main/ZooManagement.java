package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.Food;
import tn.esprit.gestionzoo.exception.InvalidAgeException;
import tn.esprit.gestionzoo.exception.ZooFullException;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        try {
            myZoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }
        try {
            myZoo.addAnimal(dog);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        try {
            myZoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }

        myZoo.displayAnimals();

        Dolphin d = new Dolphin();
        d.setSwimmingSpeed(24.5f);
        Dolphin d1 = new Dolphin();
        d1.setSwimmingSpeed(21.8f);
        Dolphin d2 = new Dolphin();
        d2.setSwimmingSpeed(20.3f);
        Dolphin d3 = new Dolphin();
        d3.setSwimmingSpeed(22.6f);






//        myZoo.displayNumberOfAquaticsByType();

//        System.out.println(myZoo.maxPenguinSwimmingDepth());


        System.out.println("----------------Prosit 8-----------------");

        Penguin penguin = new Penguin("Wild animals", "Pingu", 3, true, "Ocean", 25.6f);
        penguin.eatMeat(Food.MEAT);

        Dolphin dolphin = new Dolphin("Delphinoidea", "Willy", 5, true, "Ocean", 34.2f);
        dolphin.eatMeat(Food.MEAT);

        Terrestrial terrestrial = new Terrestrial("Bears", "Winnie", 6, true, 4);
        terrestrial.eatPlantAndMeet(Food.BOTH);

        Terrestrial terrestrial2 = new Terrestrial("Rabbits", "Bugs bunny", 2, true, 4);
        terrestrial2.eatPlants(Food.PLANTS);

    }

}