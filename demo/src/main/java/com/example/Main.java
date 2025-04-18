package com.example;

public class Main {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();

        double a = 10;
        double b = 5;

        System.out.println("Addition : " + calc.addition(a, b));
        System.out.println("Soustraction : " + calc.soustraction(a, b));
        System.out.println("Multiplication : " + calc.multiplication(a, b));
        System.out.println("Division : " + calc.division(a, b));
    }
}