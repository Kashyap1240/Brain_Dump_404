package Assingment.src.Assingment_2;
import java.util.Scanner;
public class Print_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rnum = 0;
        while(n > 0){
            int digit = n % 10;
            rnum = rnum * 10 + digit;
            n = n / 10;
        }
        System.out.println(rnum);
    }
}
