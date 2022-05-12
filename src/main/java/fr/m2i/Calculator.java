package fr.m2i;

import java.util.InputMismatchException;

public class Calculator {
    public static int addition(int a,int b)  throws ArithmeticException{
        int result = 0;
        try{
            result = a + b;
        }catch (ArithmeticException ae){
            throw new ArithmeticException();
        }

        return result;
    }

    public static int soustraction(int a,int b) throws ArithmeticException{
        int result = 0;
        try{
            result = a - b;
        }catch (ArithmeticException ae){
            throw new ArithmeticException();
        }

        return result;
    }

    public static int division(int a,int b) throws ArithmeticException{
        int result = 0;
        try{
            result = a / b;
        }catch (ArithmeticException ae){
            throw new ArithmeticException();
        }

        return result;
    }

    public static int multiplication(int a,int b) throws ArithmeticException{
        int result = 0;
        try{
            result = a * b;
        }catch (ArithmeticException ae){
            throw new ArithmeticException();
        }

        return result;
    }

}
