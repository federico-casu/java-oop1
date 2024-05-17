package org.lessons.java.javaShop;

import java.util.Random;

public class Prodotto {

    // ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private int vat;

    // COSTRUTTORI
    Prodotto (String name, double price, int vat) {
        this.code = new Random().nextInt(999999);
        this.name = name;
        this.price = price;
        this.vat = vat;
    }

    // METODI
    // code
    public String getCode() {
        return String.format("%06d", this.code);
    }

    // name
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // description
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // price
    public double getBasePrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // vat
    public int getVat() {
        return this.vat;
    }
    public void setVat(int vat) {
        this.vat = vat;
    }

    public double getTotalPrice() {
        return (this.price + (this.price * ((double)this.vat / 100)));
    }

    public String getProductName() {
        return String.format("%06d", this.code) + "-" + this.name;
    }

    public void printProduct() {
        System.out.println();
        System.out.print("Codice: " + this.getCode() + "\n");
        System.out.print("Nome: " + this.getName() + "\n");
        System.out.print("Descrizione: " + this.getDescription() + "\n");
        System.out.print("Prezzo base: " + this.getBasePrice() + "\n");
        System.out.print("Prezzo: " + this.getTotalPrice() + "\n");
        System.out.print("iva: " + this.getVat() + "\n");
        System.out.print("Nome prodotto: " + this.getProductName() + "\n");
    }

}