package org.lessons.java.javaBank;

import java.util.Random;

public class Conto {

    // ATTRIBUTI
    private int bankAccountNumber;
    private String owner;
    private double balance;

    // COSTRUTTORI
    Conto(String owner) {
        this.bankAccountNumber = new Random().nextInt(1, 1000);
        this.owner = owner;
        this.balance = 0.00;
    }

    // METODI
    public String getBankAccountNumber() {
        return String.format("%04d", this.bankAccountNumber);
    }

    public String getOwner() {
        return this.owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBalance() {
        return String.format("%.2f", this.balance);
    }

    public String withdrawal(double money) {
        if (this.balance > 0 && this.balance >= money) {
            this.balance -= money;
            return this.getBalance();
        }
        return "Errore! Saldo insufficiente\n";
    }

    public String deposit(double money) {
        this.balance += money;
        return this.getBalance();
    }

    public void printAccountInfo() {
        System.out.println();
        System.out.print("Numero conto: " + this.getBankAccountNumber() + "\n");
        System.out.print("Proprietario conto: " + this.getOwner() + "\n");
        System.out.print("Saldo: " + this.getBalance() + "\n");
    }
}
