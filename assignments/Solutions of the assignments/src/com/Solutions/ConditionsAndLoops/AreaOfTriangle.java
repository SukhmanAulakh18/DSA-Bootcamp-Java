package com.Solutions.ConditionsAndLoops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lenght of side 1: ");
        double side1=sc.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2= sc.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3=sc.nextDouble();

        double perimeter=side1+side2+side3;

        System.out.println("The perimeter of the triangle is: "+perimeter);
        sc.close();
    }
}
