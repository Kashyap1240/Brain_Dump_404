package CruxLive.src.lecture_14;
import java.util.Scanner;
import java.util.stream.Stream;

public class Reverse_Word_In_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // to remove leading and trailing spaces from string
        s.trim();
        // split on single space
        // String [] arr = s.split(" ");

        // split on multiple space
        String[] arr = s.split(" +");

        // String[] arr = s.split("\s+");

        String ans = "";
        for(int i = arr.length - 1; i >= 0; i--){
            ans = ans +arr[i] +" ";
        }
        // again trim to remove last unwanted space
        System.out.println(ans.trim());
    }
}
