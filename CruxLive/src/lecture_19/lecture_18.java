package CruxLive.src.lecture_19;
import java.util.Scanner;
public class lecture_18 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fib(n));
    }

    public static int Fib(int n){
        // base case
        if(n == 0 || n == 1){
            return n;
        }

        return Fib(n-1) + Fib(n-2);
    }
}
