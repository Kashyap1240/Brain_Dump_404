package CruxLive.src.lecture_19;
import java.lang.reflect.Parameter;
import java.util.*;
public class Generate_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ll = new ArrayList<>();
        Parentheses(n,0,0,"", ll);
    }

    public static void Parentheses(int n, int open, int close, String ans, List<String> ll){
        if(open == n && close == n){
            // System.out.println(ans);
            ll.add(ans);
            return;
        }
        if(open > n || close > open){
            return;
        }

        Parentheses(n, open + 1, close, ans+ "(", ll);
        Parentheses(n, open, close + 1, ans+ ")" , ll);
    }
}
