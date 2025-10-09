package org.example.oopJava.Farm;

public class Farm {
    private FarmAnimal farmAnimal;

    public void addFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
        System.out.println("Животное добавлено/обновлено");
    }

    public void forceProduceFarmAnimal() {
        this.farmAnimal.produce();
    }

    public void careForFarmAnimal() {
        this.farmAnimal.need();
    }
}