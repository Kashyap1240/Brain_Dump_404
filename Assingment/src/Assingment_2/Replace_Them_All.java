package Assingment.src.Assingment_2;
import java.util.Scanner;
public class Replace_Them_All {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        if (num == 0) {
            System.out.println(5);
            return;
        }

        long result = 0;
        long multiplier = 1;

        while (num > 0) {
            long digit = num % 10;
            if (digit == 0) {
                digit = 5;
            }
            result = result + digit * multiplier;
            multiplier *= 10;
            num /= 10;
        }

        System.out.println(result);
    }
}