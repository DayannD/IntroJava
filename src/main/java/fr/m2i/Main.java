package fr.m2i;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //psvm pour creer pas fonction main plus rapidement !
    public static void main(String[] args){

    Integer num1 = null;
    Integer num2 = null;
    Integer operation = null;
    int result;
    Integer i=null ;

    Scanner scanner = new Scanner(System.in);
    Calculator calcul = new Calculator();

    while (num1 == null || num2 == null){
        try{
            System.out.println("Rentrer les 2 numéros à calculer");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }catch (InputMismatchException imp){
            System.out.println("Vous avez saisie un mauvais numéro");
            scanner.nextLine();
        }
/*        if (num1 == null){
            scanner.nextLine();
        }else {
            try {
                num2 = scanner.nextInt();
            }catch (InputMismatchException imp){
                System.out.println("Vous avez saisie un mauvais numéro");
                scanner.nextLine();
            }
        }*/
    }
    System.out.println("Selectionner un 1:addition,2:soustraction,3:division,4:multiplication");
    while (i == 0){
        operation = scanner.nextInt();
        if (0<operation && operation>4){
            System.out.println("Le numéro saisi est incorrect");
            return;
        }
        i++;
    }
    scanner.close();

    switch (operation){
        case 1:
            result = calcul.addition(num1,num2);
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


/*    result = calcul.addition(num1,num2);
    System.out.println(String.format("%d + %d = %d",num1,num2,result));

    result = calcul.soustraction(num1,num2);
    System.out.println(String.format("%d - %d = %d",num1,num2,result));

    result = calcul.division(num1,num2);
    System.out.println(String.format("%d / %d = %d",num1,num2,result));

    result = calcul.multiplication(num1,num2);
    System.out.println(String.format("%d * %d = %d",num1,num2,result));*/

    }
}
