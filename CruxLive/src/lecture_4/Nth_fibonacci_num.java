package CruxLive.src.lecture_4;
import java.util.Scanner;
public class Nth_fibonacci_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        // if we need to print fibo series, then print initial a
        for(int i = 1; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
            // for fibo series
             System.out.println(a);
        }
        // System.out.println(a);

    }
}
