package CruxLive.src.lecture_16;

public class Sum_Of_Two_Array {
    public static void main(String[] args) {
        String s = "leetcode";
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        // Find the index of first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                System.out.println(freq[i]+" "+i);
            }
        }
    }
}
