package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        // write your code here
        // d1
        System.out.print("Enter a numeric value: ");
        try (Scanner scanner = new Scanner(System.in)) 
        {
            double d1 = scanner.nextDouble();

            //d2
            System.out.print("Enter a numeric value: ");
            try (Scanner scannerTwo = new Scanner(System.in)) 
            {
                double d2 = scannerTwo.nextDouble();

                // Divide and print result
                System.out.println("The answer is: " + d1/d2);
            }
        }
    }
}
