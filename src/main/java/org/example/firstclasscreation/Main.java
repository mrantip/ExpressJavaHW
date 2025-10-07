package org.example.firstclasscreation;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", 1998);
        car.setYear(2000);
        car.print();

        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.setWidth(8);
        rectangle.calculateArea();

        Book book = new Book("XOxo", "Lev");
        book.setAuthor("Puskin");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Pasha", 100);
        bankAccount.deposit(50);
        bankAccount.withdraw(100);
        bankAccount.printBalance();

        Point point = new Point(5, 10);
        point.setX(7);
        point.print();

        StudentGroup studentGroup = new StudentGroup("Telepuziki", 78);
        studentGroup.setStudentCount(50);
        studentGroup.printInfo();

        Circle circle = new Circle(5);
        circle.setRadius(9);
        circle.calculateArea();
        circle.calculateCircumference();

        Teacher teacher = new Teacher("Platon", "Music");
        teacher.setSubject("Philosophy");
        teacher.printInfo();

        Product product = new Product("Kolbasa", 100);
        product.setPrice(1000);
        product.applyDiscount(15);
        product.printInfo();

        Laptop laptop = new Laptop("HP", 256);
        laptop.setPrice(456311);
        laptop.printInfo();
    }
}
