package CruxLive.src.lecture_4;
import java.util.Scanner;
// This called Eculidian algorithum
public class GCD_Two_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        int dividend = sc.nextInt();
        while(dividend % divisor != 0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(divisor);
     }
}
