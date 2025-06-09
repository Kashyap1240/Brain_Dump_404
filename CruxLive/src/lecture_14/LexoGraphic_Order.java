package CruxLive.src.lecture_14;
import java.util.Scanner;
public class LexoGraphic_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // will return positive, negative and zero value
        // positive : s1 > s2
        // negative : s1 < s2
        // zero : s1 = s2
        System.out.println(s1.compareTo(s2));
    }
}
