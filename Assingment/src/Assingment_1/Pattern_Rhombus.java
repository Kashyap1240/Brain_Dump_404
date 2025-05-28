package Assingment.src.Assingment_1;
import java.util.Scanner;

public class Pattern_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input for the size of the pattern
        int row = 1;          // Start from row 1
        int space = n - 1;    // Initial spaces
        int num = 1;          // Initial value to print

        while (row <= 2 * n - 1) { // Loop for rows
            int i = 1;
            // Print spaces
            while (i <= space) {
                System.out.print("  "); // Two spaces for alignment
                i++;
            }

            // Print the numbers
            int val = num; // Start value
            int j = 1;
            while (j <= 2 * num - 1) {
                System.out.print(val + " ");
                if (j < num) { // Increment value in the first half
                    val++;
                } else { // Decrement value in the second half
                    val--;
                }
                j++;
            }

            // Adjust spaces and numbers for the next row
            if (row < n) { // Upper half
                space--;
                num++;
            } else { // Lower half
                space++;
                num--;
            }

            System.out.println(); // Move to the next row
            row++;
        }
    }
}