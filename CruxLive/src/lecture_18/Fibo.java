package CruxLive.src.lecture_18;
import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        System.out.println(Nth_Fibo(n));
    }

    public static int Nth_Fibo(int n){
        // base case
        if(n == 0 || n == 1){
            return n;
        }

        int f1 = Nth_Fibo(n-1);
        int f2 = Nth_Fibo(n-2);
        return f1 + f2;

    }
}
