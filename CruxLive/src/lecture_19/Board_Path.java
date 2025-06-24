package CruxLive.src.lecture_19;
import java.util.Scanner;
public class Board_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintPath(n,0, "");
    }

    public static void PrintPath(int n, int curr, String ans){
        // base case
        if(curr == n){
            System.out.println(ans);
            return;
        }

        if(curr > n){
            return;
        }

        for(int dice = 1; dice <= n; dice++){
            PrintPath(n, curr + dice, ans + dice);
        }



    }
}
