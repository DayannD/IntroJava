package fr.m2i;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    //psvm pour creer pas fonction main plus rapidement !
    public static void main(String[] args){

        Calculator myCalculator = new Calculator();

        try {
            myCalculator.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

