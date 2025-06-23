package CruxLive.src.lecture_18;
import java.util.Scanner;
public class Count_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println("\n" + Print(n, ""));
    }

    public static int Print(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans+ " ");
            return 1;
        }
        char ch = ques.charAt(0);
        int a = Print(ques.substring(1), ans);
        int b = Print(ques.substring(1),ans + ch );
        return a + b;
    }
}
