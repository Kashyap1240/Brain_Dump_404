package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        while(row <= n){
            // star
            int i = 1;
            while(i <= star){
                System.out.print("*  ");
                i++;
            }
            // line change
            System.out.println();
            row++;
        }
    }
}
