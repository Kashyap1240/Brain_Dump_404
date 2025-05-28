package Assingment.src.Assingment_1;
import java.util.Scanner;
public class Fibonacci_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int  row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(a+"\t");
                int c = a +b;
                a = b;
                b = c;
            }
            // change line
            System.out.println();
        }
    }
}

