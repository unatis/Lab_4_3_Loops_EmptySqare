package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int SizeW = 5;
        int SizeH = 5;

        for (int a = 1; a <= SizeW; a++) {
            // Inner loop for columns
            for (int b = 1; b <= SizeH; b++) {
                // Condition check using logical OR operator
                // over rows and columns positions
                // if found at circumference of rectangle
                if (a == 1 || a == SizeW || b == 1 || b == SizeH)

                    // Print the star pattern
                    System.out.print("*");
                else

                    // Rest inside square print the empty
                    // spaces
                    System.out.print(" ");
            }

            // By now we are done with only 1 row so
            // New line
            System.out.println();
        }


    }
}
