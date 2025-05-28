package CruxLive.src.lecture_15;
import java.util.Scanner;
public class Playing_Good_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(LongestString(s));
    }

    public static int LongestString(String s){
        int ans = 0;
        int cc = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                cc++;
            } else {
                ans = Math.max(ans, cc);
                cc = 0;
            }
        }
        ans = Math.max(ans, cc);
        return ans;
    }

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}
