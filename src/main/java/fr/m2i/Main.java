package fr.m2i;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //psvm pour creer pas fonction main plus rapidement !
    public static void main(String[] args){
        AbstractBrawlerCharacter character;
        String name = "";
        Integer choice = null;
        Scanner scanner = new Scanner(System.in);

        try{
            while (choice == null){ //tant que l'utilisateur rentre pas un bon numéro
                try{
                    System.out.println("Choissisez votre champion grâce au numéro:" +
                            "- 1 : soldier" +
                            "- 2 : wizard");
                    choice = scanner.nextInt();
                    if (choice < 0 || choice > 2){
                        choice = null;
                        System.out.println("Votre saisie est incorrect");
                        continue;
                    }
                }catch (InputMismatchException ime){
                    System.out.println("Votre saisie est incorrecte");
                    scanner.nextLine();
                }
            }
            System.out.println("Entrer le nom de votre personnage");
            name = scanner.next();
        }catch (InputMismatchException ime){
            System.out.println("Votre saisie est incorrecte");
            scanner.nextLine();
        }catch (Exception e){
            System.out.println("Oups une erreur est survenue");
            return;
        }finally {
            scanner.close();
        }

 /*       String nameCharac = name;//Comment faire pour instacier une classe avec son propre nom*/

        if (choice == 1){
            Soldier soldier1 = new Soldier(name);
            soldier1.attack();
        }else {
            Wizard wizard1 = new Wizard(name);
            wizard1.attack();
        }

    }
}
