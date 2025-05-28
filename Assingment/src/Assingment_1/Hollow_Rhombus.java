package Assingment.src.Assingment_1;
import java.util.Scanner;
public class Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space1 = n - 1;
        int space2 = n - 2;
        while(row <= n){
            if(row == 1 || row == n){
                // space1
                int k = 1;
                while(k <= space1){
                    System.out.print(" ");
                    k++;
                }
                // star
                int j = 1;
                int star = n;
                while(j <= star){
                    System.out.print("*");
                    j++;
                }
            } else{
                // space1
                int k = 1;
                while(k <= space1){
                    System.out.print(" ");
                    k++;
                }
                // print star1
                System.out.print("*");

                // print space2
                int i = 1;
                while(i <= space2){
                    System.out.print(" ");
                    i++;
                }
                // print second star
                System.out.print("*");
            }
            // next row preparation
            System.out.println();
            row++;
            space1--;
        }
    }
}
