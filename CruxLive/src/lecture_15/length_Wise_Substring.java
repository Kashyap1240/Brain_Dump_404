package CruxLive.src.lecture_15;
import java.util.Scanner;
public class length_Wise_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Display(s);
    }

    public static void Display(String s){
        for(int len = 1; len <= s.length() - 1; len++){
            for(int j = len;  j <= s.length(); j++){
                int i = j - len;
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
