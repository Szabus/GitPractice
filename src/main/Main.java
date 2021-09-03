package main;

import main.model.animals.Animal;
import main.model.animals.Cat;
import main.model.animals.Dog;
import main.model.animals.RoseLamb;
import main.model.humanoids.Human;

public class Main {

    public static void main(String[] args) {

        Human triton = new Human();
        Animal cat = new Cat();
        Animal tiger = new Animal();
        Animal giraffe = new Animal();

        triton.getNewPet(cat);
        triton.getNewPet(tiger);
        triton.getNewPet(giraffe);

        Human ursula = new Human();

        Animal kitty = new Cat();
        Animal dog = new Dog();
        Animal lamb = new RoseLamb();

        ursula.getPetsOwned().add(kitty);
        ursula.getPetsOwned().add(dog);
        ursula.getPetsOwned().add(lamb);

    }
}
