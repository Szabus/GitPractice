package main.model.humanoids;

import main.model.Gender;
import main.model.animals.Animal;

import java.time.LocalDate;
import java.util.List;

public class Humanoid implements HumanoidInterface {

    protected String lastName;
    protected String firstName;
    protected LocalDate birth;
    protected boolean isSad;

    protected List<Animal> petsOwned;

    public Humanoid() {}

    public Humanoid(String lastName, String firstName, LocalDate birth, boolean isSad, List<Animal> petsOwned) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birth = birth;
        this.isSad = isSad;
        this.petsOwned = petsOwned;
    }

    public Humanoid(String lastName, String firstName, LocalDate birth) {
        // TODO
    }


    @Override
    public void getNewPet(Animal animal) {
        // TODO
    }

    @Override
    public void feedPets() {
        // TODO
    }

    @Override
    public void renamePet(Animal animal, String newName) {
        // TODO
    }

}
