package main.model.humanoids;

import main.model.animals.Animal;

public class Gollum extends Humanoid{

    public void renamePet(Animal animal, String newName) {
        animal.setName("my precious " + newName);
    }
}
