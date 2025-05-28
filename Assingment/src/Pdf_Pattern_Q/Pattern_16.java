package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 5;
        int space = n - 1;
        while(row <= 2*n-1){
            // space
            int i = 1;
            while(i <= space){
                System.out.print("\t");
                i++;
            }
            // star
            int j = 1;
            while(j <= star){
                System.out.print("*\t");
                j++;
            }
            // next line preparation
            System.out.println();
            row++;
            //mirror
            if(row <= n){
                space--;
                star--;
            } else {
                space++;
                star++;
            }

        }
    }
}
