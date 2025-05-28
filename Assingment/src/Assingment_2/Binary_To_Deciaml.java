package Assingment.src.Assingment_2;
import java.util.Scanner;
public class Binary_To_Deciaml {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int mul = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * mul;
            mul = mul * 2;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
