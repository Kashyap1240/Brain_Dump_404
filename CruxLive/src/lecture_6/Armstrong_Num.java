package CruxLive.src.lecture_6;
import java.util.Scanner;
public class Armstrong_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        System.out.print(Armstrong(n));
    }

    // check armstrong or not
    public static boolean Armstrong(int n){
        int temp = n;
        int dc = Digit_Count(n);
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += Math.pow(digit,dc);
            n = n / 10;
        }
        if(temp != sum){
            return false;
        } else {
            return true;
        }
    }


    // count total digits in the number
    public static int Digit_Count(int n){
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }
}
