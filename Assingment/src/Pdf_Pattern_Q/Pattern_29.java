package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;

public class Pattern_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input the number of rows
        int row = 1;
        int star = 1; // Number of digits to print
        int space = n - 1; // Initial spaces before the first row

        while (row <= n) {
            // Print spaces
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }

            // Print numbers and zeros
            int j = 1;
            while (j <= star) {
                if (j == 1 || j == star) {
                    // Print row number at the start and end
                    System.out.print(row + "\t");
                } else {
                    // Print zero in between
                    System.out.print("0\t");
                }
                j++;
            }

            // Prepare for the next row
            System.out.println(); // Move to the next line
            row++; // Increment row number
            space--; // Decrease spaces
            star += 2; // Increase the number of digits
        }
    }
}