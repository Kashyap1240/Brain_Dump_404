package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row <= n){
            if(row == 1 || row == n){
                int j = 1;
                int star = n;
                while(j <= star){
                    System.out.print("* ");
                    j++;
                }
            } else{
                // print first star
                System.out.print("* ");
                // print space
                int i = 1;
                int space = n - 2;
                while(i <= space){
                    System.out.print("  ");
                    i++;
                }
                // print second star
                System.out.print("* ");
            }
            // next row preparation
            System.out.println();
            row++;
        }
    }
}
