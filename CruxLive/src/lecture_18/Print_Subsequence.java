package CruxLive.src.lecture_18;
import java.util.Scanner;
public class Print_Subsequence {
    public static void main(String[] args) {
        String ques = "abc";
        Print(ques, "");  // "" --> blank String
    }

    public static void Print(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans+ " ");
            return;
        }
        char ch = ques.charAt(0);
        Print(ques.substring(1), ans);
        Print(ques.substring(1),ans + ch );
    }
}
