/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vu.questiontwob;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Circle {

    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (22.0 / 7.0) * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * (22.0 / 7.0) * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        

    }
}



