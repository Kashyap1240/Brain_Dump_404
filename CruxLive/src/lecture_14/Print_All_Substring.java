package CruxLive.src.lecture_14;
import java.util.Scanner;
public class Print_All_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Substring(s);
    }

    public static void Substring(String s){
        int len = s.length() - 1;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
