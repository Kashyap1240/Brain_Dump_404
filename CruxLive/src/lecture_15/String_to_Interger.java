package CruxLive.src.lecture_15;
import java.util.Scanner;
public class String_to_Interger {
    public static void main(String[] args) {
        String s1 = "1931";
        int x1 = Integer.parseInt(s1);
        x1++;
        System.out.println(x1);

        String s2 = "70910000000000";
        Long x2 = Long.parseLong(s2);
        x2++;
        System.out.println(x2);
    }
}
