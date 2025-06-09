package CruxLive.src.lecture_14;
import java.util.Scanner;
public class Freq_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] freq = new int[26];
        // working on frequency array
        for(int i = 0; i < s.length(); i++){
            // first find the index of present character
            int idx = s.charAt(i) - 'a';
            freq[idx]++; // freq[idx] = freq[idx] + 1
        }

        // now print all those indexes
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                char ch = (char)('a' + i); // i = char - 'a'
                System.out.println(ch + " " + freq[i]);
            }
        }
    }
}
