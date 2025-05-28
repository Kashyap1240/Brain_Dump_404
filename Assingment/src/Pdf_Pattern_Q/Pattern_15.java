package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = 0;
        while(row <= 2*n-1){
            // star
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            // next line preparation
            System.out.println();
            row++;
            // mirror
            if(row <= n){
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }

            // space
            int j = 1;
            while(j <= space){
                System.out.print("  ");
                j++;
            }

        }
    }
}
