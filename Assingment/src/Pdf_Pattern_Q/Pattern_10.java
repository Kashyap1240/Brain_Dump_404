package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 2*n-1;
        int space = 0;
        while(row <= n){
            //space
            int j = 1;
            while(j <= space){
                System.out.print("  ");
                j++;
            }
            // star
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            // next line preparation
            System.out.println();
            row++;
            star -= 2;
            space++;
        }
    }
}
