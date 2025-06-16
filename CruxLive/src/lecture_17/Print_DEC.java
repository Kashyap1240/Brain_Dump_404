package CruxLive.src.lecture_17_Recursion;
import java.util.Scanner;
public class Print_DEC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PD(n);
    }

    public static void PD(int n){
        // base case
        if(n == 0){
            return ;
        }

        System.out.println(n);
        PD(n-1);
    }
}
