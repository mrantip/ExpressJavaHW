package org.example.firstclasscreation;

public class BankAccount {

    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void printBalance() {
        System.out.println("Текущий баланс " + this.balance + "руб.");
    }
}
