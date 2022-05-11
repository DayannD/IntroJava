package fr.m2i;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //psvm pour creer pas fonction main plus rapidement !
    public static void main(String[] args){
        //exo 2g
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        while (true){
            try{
                System.out.print( "Entrer nombre a calculer: " );
                num = scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.print( "Vous devez rentrer un entier,reesayer\n" );
                scanner.nextLine();
            }
        }
        scanner.close();

        for (int i=0; i <= 10; i++){
            String resultFormat = "%d * %d = %d";
            String result = String.format(resultFormat,num,i,num*i);
            System.out.println(result);
        }
    }
}
