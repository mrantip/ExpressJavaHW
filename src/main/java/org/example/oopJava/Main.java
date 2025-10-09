package org.example.oopJava;

import org.example.oopJava.Aquarium.Aquarium;
import org.example.oopJava.Aquarium.Shark;
import org.example.oopJava.Aquarium.StarFish;
import org.example.oopJava.Farm.Chicken;
import org.example.oopJava.Farm.Cow;
import org.example.oopJava.Farm.Farm;
import org.example.oopJava.Garden.Cactus;
import org.example.oopJava.Garden.Garden;
import org.example.oopJava.Garden.Orchid;
import org.example.oopJava.Museum.Manuscript;
import org.example.oopJava.Museum.Museum;
import org.example.oopJava.Museum.Sculpture;
import org.example.oopJava.Park.Carousel;
import org.example.oopJava.Park.Park;
import org.example.oopJava.Park.RollerCoaster;
import org.example.oopJava.Pet.Cat;
import org.example.oopJava.Pet.Dog;
import org.example.oopJava.Pet.PetManager;
import org.example.oopJava.Restaurant.Drink;
import org.example.oopJava.Restaurant.HotDish;
import org.example.oopJava.Restaurant.Menu;
import org.example.oopJava.Zoo.Bird;
import org.example.oopJava.Zoo.Elephant;
import org.example.oopJava.Zoo.Zoo;

public class Main {

    public static void main(String[] args) {

        //1. Зоопарк

        Zoo zoo = new Zoo();
        Bird bird = new Bird();
        zoo.addAnimal(bird);
        zoo.forceMakeSound();
        zoo.forceMove();
        Elephant elephant = new Elephant();
        zoo.addAnimal(elephant);
        zoo.forceMakeSound();
        zoo.forceMove();

        //2. Управление домашними питомцами

        PetManager petManager = new PetManager();
        Cat cat = new Cat();
        petManager.addPet(cat);
        petManager.feedPet();
        petManager.interactPet();
        Dog dog = new Dog();
        petManager.addPet(dog);
        petManager.feedPet();
        petManager.interactPet();

        //3. Управление рестораном

        Menu menu = new Menu();
        HotDish hotDish = new HotDish(57);
        Drink drink = new Drink(1000);
        menu.addDish(hotDish);
        menu.addDish(drink);
        menu.printMenu();

        //4. Аквариум

        Aquarium aquarium = new Aquarium();
        Shark shark = new Shark();
        aquarium.addSeaCreature(shark);
        aquarium.showBehavior();
        StarFish starFish = new StarFish();
        aquarium.addSeaCreature(starFish);
        aquarium.showBehavior();

        //5. Ферма

        Farm farm = new Farm();
        Chicken chicken = new Chicken();
        farm.addFarmAnimal(chicken);
        farm.forceProduceFarmAnimal();
        farm.careForFarmAnimal();
        Cow cow = new Cow();
        farm.addFarmAnimal(cow);
        farm.forceProduceFarmAnimal();
        farm.careForFarmAnimal();

        //6. Ботанический сад

        Garden garden = new Garden();
        Cactus cactus = new Cactus();
        garden.addPlant(cactus);
        garden.careForPlant();
        Orchid orchid = new Orchid();
        garden.addPlant(orchid);
        garden.careForPlant();

        //7. Парк развлечений

        Park park = new Park();
        Carousel carousel = new Carousel();
        park.addAttraction(carousel);
        park.showInfo();
        park.maintainAttraction();
        RollerCoaster rollerCoaster = new RollerCoaster();
        park.addAttraction(rollerCoaster);
        park.showInfo();
        park.maintainAttraction();

        //8. Музей

        Museum museum = new Museum();
        Manuscript manuscript = new Manuscript();
        museum.addExhibit(manuscript);
        museum.showDescription();
        museum.preserveExhibit();
        Sculpture sculpture = new Sculpture();
        museum.addExhibit(sculpture);
        museum.showDescription();
        museum.preserveExhibit();
    }
}