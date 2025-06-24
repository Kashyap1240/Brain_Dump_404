package CruxLive.src.lecture_19;
import java.lang.reflect.Parameter;
import java.util.Scanner;
public class Generate_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Parentheses(n,0,0,"");
    }

    public static void Parentheses(int n, int open, int close, String ans){
        if(open == n && close == n){
            System.out.println(ans);
            return;
        }
        if(open > n || close > open){
            return;
        }

        Parentheses(n, open + 1, close, ans+ "(" );
        Parentheses(n, open, close + 1, ans+ ")" );
    }
}
