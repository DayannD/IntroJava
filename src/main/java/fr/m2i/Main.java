package fr.m2i;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //psvm pour creer pas fonction main plus rapidement !
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer number = null;

        while (number == null) {
            try {
                System.out.print("Entrez un nombre : ");
                number = scanner.nextInt(); // Exception potentiellement levée, donc la variable number reste à null
            } catch (InputMismatchException e) {
                System.out.println("Attention ! Vous devez entrez un nombre");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Mince une erreur s'est produite :(");
                return;
            }
        }
        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", number, i, number * i));
        }


    }
}
