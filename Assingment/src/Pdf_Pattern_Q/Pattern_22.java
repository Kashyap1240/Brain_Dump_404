package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = -1;
        while(row <= n){
            // star
            int i = 1;
            while(i <= star){
                System.out.print("*\t");
                i++;
            }

            // space
            int j = 1;
            while(j <= space){
                System.out.print("\t");
                j++;
            }

            // star
            int k = 1;
            if(row == 1){
                k = 2;
            }
            while(k <= star){
                System.out.print("*\t");
                k++;
            }
            // next line preparation
            System.out.println();
            row++;
            star--;
            space += 2;

        }
    }
}
