package Assingment.src.Assingment_1;

import java.util.Scanner;

public class Pattern_Mountain_____ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows
        int row = 1;          // Start from row 1
        int star = 1;         // Number of digits on each side
        int space = 2 * (n - 1); // Total spaces between mirrored parts

        while (row <= n) {
            // Left side numbers
            int j = 1;
            int count = 1; // Start from 1
            while (j <= star) { // Print left side numbers incrementally
                System.out.print(count + "\t");
                count++;
                j++;
            }

            // Spaces in the middle
            int i = 1;
            while (i <= space) { // Print spaces between left and right parts
                System.out.print("\t");
                i++;
            }

            // Right side numbers (mirroring)4
            count = star; // Reset count to the last value of the left side
            j = 1;
            while (j <= star) { // Print right side numbers decrementally
                System.out.print(count + "\t");
                count--;
                j++;
            }

            // Next row preparation
            System.out.println(); // Move to the next line
            row++;                // Increment row
            star++;               // Increase stars for the next row
            space -= 2;           // Decrease spaces for the next row
        }
    }
}