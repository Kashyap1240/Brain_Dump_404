package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n - 1;
        while(row <= 2*n-1){
            // space
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
            // mirror condition
            if(row < n){
                star++;
                space--;
            } else {
                star--;
                space++;
            }

            // next line
            System.out.println();
            row++;
        }
    }
}
