package CruxLive.src.lecture_5;
import java.util.Scanner;
public class Binary_To_Decimal {
    public static void main(String[] args) {
        int n  = 100111;
        int sum = 0;
        int mul = 1; // 2^0
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem * mul;
            mul = mul * 2;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
