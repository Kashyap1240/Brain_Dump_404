package Assingment.src.Assingment_2;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = GCD(n1,n2);
        int lcm = (n1 * n2) / gcd;
        System.out.println(lcm);

    }

    // cal gcd
    public static int GCD(int dividend, int divisor) {
        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
    }
}
