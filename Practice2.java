//Write a Java program to solve a system of two linear equations with two variables (e.g., ax + by = e and cx + dy = f). 
//Prompt the user to enter the coefficients a, b, c, d, e, f. Calculate and display the values of x and y using Cramer's rule. 
//Include error handling for cases where the denominator is zero Cramer's rule : D=ad−bc, Dx=ed−bf, Dy=af−ce,x=Dx/D, y=Dy/D

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter e: ");
        double e = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.print("Enter d: ");
        double d = sc.nextDouble();
        System.out.print("Enter f: ");
        double f = sc.nextDouble();
        
        double D = a * d - b * c;
        
        if (Math.abs(D) < 1e-10) {
            System.out.println("No unique solution (D=0).");
        } else {
            double Dx = e * d - b * f;
            double Dy = a * f - e * c;
            double x = Dx / D;
            double y = Dy / D;
            
            System.out.printf("x = %.2f, y = %.2f%n", x, y);
        }
    }
}