package fr.m2i;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //psvm pour creer pas fonction main plus rapidement !
    public static void main(String[] args){

    Integer num1 = null;//Integer est un wrapper
    Integer num2 = null;
    Integer operation = null;
    int result;
    int i= 0;//variable pour boucler dans mon while
    int z = 0;//variable pour boucler dans mon while

    Scanner scanner = new Scanner(System.in);
    Calculator calcul = new Calculator();

    while (num1 == null || num2 == null){
        try{
            System.out.println("Rentrer les 2 numéros à calculer");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }catch (InputMismatchException imp){
            System.out.println("Vous avez saisie un mauvais numéro");
            scanner.nextLine();//Cette méthode peut lire l’entrée jusqu’à la fin de la ligne
        }
    }

    while (i == 0){
        try {
            System.out.println("Selectionner un 1:addition,2:soustraction,3:division,4:multiplication");
            operation = scanner.nextInt();
            if (0<operation && operation>4){//Si operation est inferieur a 0 et suppérieur a 4
                System.out.println("Le numéro saisi est incorrect");
                continue;//on reprend direct a la condition de la boucle
            }
        }catch(InputMismatchException imp){
            System.out.println("Vous avez saisie un mauvais numéro");
            z=1;//Si l'utilisateur rentre des lettres j'utilise cette variable pour rentrer dans le if et faire un continue
            scanner.nextLine();
        }
        if (z==1){
            z=0;
            continue;
        }
        i++;//J'utilise cette variable pour sortir de la boucle
    }
    scanner.close();//Je ferme mon scanner pour des soucis performance

    switch (operation){//je fait un switch sur ma variable opération choisis par l'utilisateur pour lui renvoyer les données souhaiter
        case 1:
            result = calcul.addition(num1,num2);//Je fait appelle à ma méthode dans la classe calculator
            System.out.println(String.format("%d + %d = %d",num1,num2,result));
            break;
        case 2:
            result = calcul.soustraction(num1,num2);
            System.out.println(String.format("%d - %d = %d",num1,num2,result));
            break;
        case 3:
            result = calcul.division(num1,num2);
            System.out.println(String.format("%d / %d = %d",num1,num2,result));
            break;
        case 4:
            result = calcul.multiplication(num1,num2);
            System.out.println(String.format("%d * %d = %d",num1,num2,result));
            break;
        default:
            System.out.println("Oups il y a eu une erreur");
            break;
        }
    }
}
