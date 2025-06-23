package CruxLive.src.lecture_18;
import java.util.Scanner;
public class CointToss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Total: "+ (int)Math.pow(2,n));
        Print(n, "");
    }

    public static void Print(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }

        Print(n - 1, ans + "H");
        Print(n - 1, ans + "T");
    }
}
