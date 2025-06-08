package CruxLive.src.lecture_14;
import java.util.Scanner;
public class equals_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        System.out.println(equals(s1,s2));
    }

    public static boolean equals(String s1, String s2){
        // if directly add is same, means present in string pool
        if(s1 == s2){
            return true;
        }
        // if add is same but length is not same
        if(s1.length() != s2.length()){
            return false;
        }
        // now we can compare character by character
        for(int i = 0; i < s2.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
