package CruxLive.src.lecture_19;
import java.util.Scanner;
public class Board_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        PrintPath(n,0, "");
    }

    public static void PrintPath(int n, int curr, String ans){
        // base case
        if(curr == n){
            System.out.println(ans);
            return; // 1
        }

        if(curr > n){
            return; // 0
        }

        PrintPath(n, curr + 1, ans+1); // a
        PrintPath(n, curr + 2, ans + 2); // b
        PrintPath(n, curr + 3, ans + 3); // c
    }
}
