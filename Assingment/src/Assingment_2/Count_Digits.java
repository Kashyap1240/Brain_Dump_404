package Assingment.src.Assingment_2;
import java.util.Scanner;
public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        int digit_Count = 0;
        while(num > 0){
            int rem = num % 10;
            if (rem == digit){
                digit_Count++;
            }
            num = num / 10;
        }
        System.out.println(digit_Count);
    }
}
