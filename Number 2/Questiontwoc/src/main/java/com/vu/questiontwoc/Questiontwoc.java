/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.questiontwoc;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Questiontwoc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter coefficients a, b, c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();
        
        // Create QuadraticEquation object
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        
        // Calculate and display the roots
        equation.calculateRoots();
    }
}


