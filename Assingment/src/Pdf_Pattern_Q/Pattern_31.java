package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row <= n){
            // digit
            int i = 1;
            int star = n; // digit
            while(i <= n){
                if(row + i == n + 1){
                    System.out.print("*\t");
                } else {
                    System.out.print(star+"\t");
                }
                star--;
                i++;
            }
            // next line
            System.out.println();
            row++;
        }
    }
}
