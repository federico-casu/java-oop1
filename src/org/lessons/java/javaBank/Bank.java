package org.lessons.java.javaBank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Inserisci il tuo nome: ");
        Conto account = new Conto(scanner.nextLine());
        account.printAccountInfo();
        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1 - versa");
            System.out.println("2 - preleva");
            System.out.println("0 - esci");
            System.out.print("Inserisci il numero corrispondente alla scelta: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Inserisci l'importo da versare: ");
                    System.out.print(account.deposit(Double.parseDouble(scanner.nextLine())));
                    account.printAccountInfo();
                    break;
                case 2:
                    System.out.println("Inserisci l'importo da prelevare: ");
                    System.out.print(account.withdrawal(Double.parseDouble(scanner.nextLine())));
                    account.printAccountInfo();
                    break;
            }

        } while (choice != 0);



        scanner.close();
    }
}
