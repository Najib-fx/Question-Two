/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.questiontwob;

/**
 *
 * @author HP
 */
 import java.util.Scanner;
public class QuestionTwob {

//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
//        
        // Create Circle object

        Circle circle = new Circle(radius);
        
        // Calculate and display Area and Circumference
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Circumference of the circle: " + circle.calculateCircumference());
    

    }
}
