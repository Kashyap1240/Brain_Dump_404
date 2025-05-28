package Assingment.src.Assingment_2;
import java.util.Scanner;
public class Check_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int new_num = Armstrong(n);
        if(new_num == n){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // check
    public static int Armstrong(int num){
        int new_num = 0;
        int dc = Digit_Count(num);
        while(num > 0){
            int digit = num % 10;
            new_num += (int) Math.pow(digit, dc);
            num = num / 10;
        }
        return new_num;
    }


    // for digit count
    public static int Digit_Count(int num){
        if (num == 0) {
            return 1; // Handle edge case for 0
        }
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}
