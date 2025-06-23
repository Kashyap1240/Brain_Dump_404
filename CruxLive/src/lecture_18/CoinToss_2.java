package CruxLive.src.lecture_18;
import java.util.Scanner;

// print all possible output for which there is no 2 consecutive head
public class CoinToss_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n, "");
    }

    public static void Print(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        // for first 'H' let it go
        // there after check for last char in ans, weather it is 'H' or not
        // if not, then only call corresponding recursive call
        if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H'){
            Print(n -1, ans + "H");
        }
        Print(n-1, ans + "T");
    }
}
