package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        while(row <= n){
            //star
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            // next line preparation
            System.out.println();
            row++;
            star++;
        }
    }
}
