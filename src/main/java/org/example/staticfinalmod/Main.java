package org.example.staticfinalmod;

public class Main {

    public static void main(String[] args) {

        Company company1 = new Company(1, "Masha");
        Company company2 = new Company(2, "Dasha");
        Company.companyName = "Nvidia";
        //пробуем изменить поле EMPLUYEE_ID
//        company1.EMPLUYEE_ID = 5;
        Company.printCompanyName();

        MathConstants.calculateCircleArea(5);
        MathConstants.calculateCircleArea(50);
        MathConstants.calculateCircumference(2);
        MathConstants.calculateCircumference(20);

        University university1 = new University(1, "Oleg");
        University university2 = new University(2, "Glasha");
        University university3 = new University(3, "Sergei");
        University.changeUniversityName("MGU");
        university1.printStudentInfo();
        university2.printStudentInfo();
        university3.printStudentInfo();

        GameSettings gameSettings1 = new GameSettings("Regbi");
        GameSettings gameSettings2 = new GameSettings("Soccers");
        GameSettings.setMaxPlayers(10);
        gameSettings1.addPlayer();
        gameSettings1.addPlayer();
        gameSettings2.addPlayer();
        gameSettings2.addPlayer();
        gameSettings2.addPlayer();
        gameSettings2.addPlayer();
        gameSettings2.addPlayer();
        gameSettings2.addPlayer();
        gameSettings2.addPlayer();
        gameSettings2.addPlayer();
        gameSettings2.addPlayer();
        gameSettings2.addPlayer();
        gameSettings2.addPlayer();

        gameSettings1.printGameStatus();
        gameSettings2.printGameStatus();

        Person person1 = new Person("John", "Smith", "123");
        Person person2 = new Person("Masha", "Ivanova", "345");

        person1.setFirstName("Sergei");
        person1.printPersonInfo();
        person2.printPersonInfo();
    }
}
