package CruxLive.src.lecture_17_Recursion;
import java.util.Scanner;
public class Factroial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fact(n));
    }


    // this will give stack overflow
    public static int Fact(int n){
        // base case
        if (n == 0){
            return 1;
        }
        // small problem
        return n * Fact(n-1);
    }
}
