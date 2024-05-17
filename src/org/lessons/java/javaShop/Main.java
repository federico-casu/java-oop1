package org.lessons.java.javaShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Prodotto p1 = new Prodotto("sedia", 79.99, 22);

        p1.printProduct();
        p1.setDescription("Descrizione sedia Descrizione sedia Descrizione sedia Descrizione sedia");
        p1.printProduct();
        p1.setName("palla");
        p1.printProduct();
        p1.setPrice(15.99);
        p1.printProduct();

        scanner.close();
    }
}
