package Assingment.src.Assingment_2;
import java.util.Scanner;
public class Armstrong_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int i = n1; i <= n2; i++){
            int new_num = Armstrong(i);
            if(new_num == i){
                System.out.println(i);
            }
        }

    }

    // function to find corresponding number
    public static int Armstrong(int num){
        int new_num = 0;
        int dc = Digit_Count(num);
        while(num > 0){
            int digit = num % 10;
            new_num += Math.pow(digit,dc);
            num = num /10;
        }
        return new_num;
    }

    // function for digit count
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
