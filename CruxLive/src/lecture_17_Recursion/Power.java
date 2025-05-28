package CruxLive.src.lecture_17_Recursion;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(ath_Power(a,n));
    }

    public static int ath_Power(int a, int n){
        // base case
        if(n == 0){
            return 1;
        }
        int curr = ath_Power(a, n-1);
        return curr * a;
    }
}
