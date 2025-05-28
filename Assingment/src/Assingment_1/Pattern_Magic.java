package Assingment.src.Assingment_1;
import java.util.Scanner;
public class Pattern_Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = -1;
        while(row <= 2*n-1){
            // star
            int i = 1;
            while(i <= star){
                System.out.print("*");
                i++;
            }
            // space
            int j = 1;
            while(j <= space){
                System.out.print(" ");
                j++;
            }
            // star
            int k = 1;
            if(row == 1 || row == 2*n-1){
                k = 2;
            }
            while(k <= star){
                System.out.print("*");
                k++;
            }
            // next line preparation
            System.out.println();
            row++;
            if(row <= n){
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
        }
    }
}
