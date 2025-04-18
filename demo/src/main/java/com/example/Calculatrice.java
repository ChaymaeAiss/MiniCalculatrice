package com.example;

public class Calculatrice {

    // Méthode pour l'addition
    public double addition(double a, double b) {
        return a + b;
    }
    
    // Méthode pour la soustraction
    public double soustraction(double a, double b) {
        return a - b;
    }
    
    // Méthode pour la multiplication
    public double multiplication(double a, double b) {
        return a * b;
    }
    
    // Méthode pour la division
    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro impossible !");
        }
        return a / b;
    }  
}
