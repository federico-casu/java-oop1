package org.lessons.java.javaBank;

import java.math.BigDecimal;
import java.util.Random;

public class Conto {

    // ATTRIBUTI
    private int bankAccountNumber;
    private String owner;
    private BigDecimal balance;

    // COSTRUTTORI
    Conto(String owner) {
        this.bankAccountNumber = new Random().nextInt(1, 1000);
        this.owner = owner;
        this.balance = new BigDecimal(0.00);
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

    public String withdrawal(BigDecimal money) {
//        if (this.balance > 0 && this.balance >= money) {
//            this.balance -= money;
//            return this.getBalance();
//        }
        if ((this.balance.compareTo(new BigDecimal("0.00"))) > 0 && (this.balance.compareTo(money)) >= 0) {
            this.balance = this.balance.subtract(money);
            return this.getBalance();
        }
        return "Errore! Saldo insufficiente\n";
    }

    public String deposit(BigDecimal money) {
//        this.balance += money;
        this.balance = this.balance.add(money);
        return this.getBalance();
    }

    public void printAccountInfo() {
        System.out.println();
        System.out.print("Numero conto: " + this.getBankAccountNumber() + "\n");
        System.out.print("Proprietario conto: " + this.getOwner() + "\n");
        System.out.print("Saldo: " + this.getBalance() + "\n");
    }
}
