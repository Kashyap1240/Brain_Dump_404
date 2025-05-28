package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;

        while(row <= 2*n-1){
            // star
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            // mirror condition
            if(row < n){
                star++;
            } else {
                star--;
            }

            // next line
            System.out.println();
            row++;
        }
    }
}
