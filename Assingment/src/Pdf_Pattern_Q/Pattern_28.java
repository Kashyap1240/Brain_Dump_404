package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;

public class Pattern_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1; // digit
        int space = n - 1;

        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }

            // numbers
            int j = 1;
            int val = row;
            while (j <= star) {
                System.out.print(val + "\t");
                // vertical mirror
                if (j < star / 2 + 1) {
                    val++;
                } else {
                    val--;
                }
                j++;
            }

            // next line preparation
            System.out.println();
            row++;
            space--;
            star += 2;
        }
    }
}