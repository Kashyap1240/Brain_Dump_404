package Assingment.src.Pdf_Pattern_Q;
import java.util.Scanner;
public class Pattern_8___ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row <= n){
            // diagonal ele
            int i = 1;
            while(i <= row){
                if(row == i || row + i == n+1){
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
