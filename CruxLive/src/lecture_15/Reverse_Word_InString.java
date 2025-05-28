package CruxLive.src.lecture_15;

public class Reverse_Word_InString {
    public static void main(String[] args) {
        String s = "  the sky  is blue  ";
        String[] arr = s.split("\s+");
        String ans = "";
        for (int i = arr.length -1 ; i >= 0; i--) {
            ans = ans + arr[i] + " ";
        }

        System.out.println(ans.trim());
    }
}
