package org.example.oopJava.Pet;

public class PetManager {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
        System.out.println("Животное добавлено/обновлено");
    }

    public void feedPet() {
        this.pet.feed();
    }

    public void interactPet() {
        this.pet.interact();
    }
}