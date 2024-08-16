/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vu.questiontwoc;

/**
 *
 * @author HP
 */

    public class QuadraticEquation {
    private double a, b, c;

    // Constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateRoots() {
        double determinant = b * b - 4 * a * c;
        double sqrt = Math.sqrt(Math.abs(determinant));

        if (determinant > 0) {
            System.out.println("Roots are real and different.");
            double root1 = (-b + sqrt) / (2 * a);
            double root2 = (-b - sqrt) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (determinant == 0) {
            System.out.println("Roots are real and same.");
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("Roots are complex and different.");
            double realPart = -b / (2 * a);
            double imaginaryPart = sqrt / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    
    }}
