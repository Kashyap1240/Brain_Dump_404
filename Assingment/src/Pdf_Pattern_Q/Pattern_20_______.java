package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_20_______ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n/2;
        while(row <= n){
            // space
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while(j <= star){
                System.out.print("* ");
                j++;
            }
            // space
            int k = 1;
            while(k <= space){

            }

        }
    }
}
