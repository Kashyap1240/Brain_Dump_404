package CruxLive.src.lecture_14;
import java.util.Scanner;
public class Plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
    }

    public static boolean check(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
