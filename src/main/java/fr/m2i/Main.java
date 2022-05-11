package fr.m2i;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //psvm pour creer pas fonction main plus rapidement !
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        byte num1 = 0;
        byte num2 = 0;

        while (true){
            try {
                System.out.print( "Entrer le premier nombre entre 0 et 127 : " );
                num1 = scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.print("Le nombre que vous avez rentrer est ERRONE\n");
                scanner.nextLine();
            }
            if (num1 != 0){
                try {
                    System.out.print( "Entrer le deuxieme nombre entre 0 et 127 : " );
                    num2 = scanner.nextByte();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Le nombre que vous avez rentrer est ERRONE\n");
                    scanner.nextLine();
                }
            }
        }
        scanner.close();


        String resultFormat = "Resultat : %d * %d = %d";
        int ResutToInt = num1 * num2;
        String result = String.format(resultFormat,num1,num2,ResutToInt);
        System.out.println(result);
    }
}
