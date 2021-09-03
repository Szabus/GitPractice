package main;

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

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal lamb = new RoseLamb();

        ursula.getPetsOwned().add(cat);
        ursula.getPetsOwned().add(dog);
        ursula.getPetsOwned().add(lamb);

    }
}
