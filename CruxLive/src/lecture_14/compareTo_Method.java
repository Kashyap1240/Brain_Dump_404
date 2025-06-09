package CruxLive.src.lecture_14;
import java.util.Scanner;
public class compareTo_Method {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(compare(s1,s2));
    }

    public static int compare(String s1, String s2){
        // to handle same string
        if(s1 == s2){
            return 0;
        }
        // to handle diff string
        int n = Math.min(s1.length(), s2.length());
        for(int i = 0; i < n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        // to handle same string wih diff length i.e, ankit and ankita
        return s1.length() - s2.length();
    }
}
