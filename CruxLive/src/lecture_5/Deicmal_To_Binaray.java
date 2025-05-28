package CruxLive.src.lecture_5;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Deicmal_To_Binaray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal Number: ");
        int num = sc.nextInt();
        int mul = 1;
        int sum = 0;
        while(num > 0){
            int rem = num % 2;
            sum = sum + rem * mul;
            mul = mul * 10;
            num = num / 2;
        }
        System.out.println("Binary representation of given number is:" +sum);
    }
}
