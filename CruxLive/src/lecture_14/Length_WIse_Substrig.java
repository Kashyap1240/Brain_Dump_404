package CruxLive.src.lecture_14;

public class Length_WIse_Substrig {
    public static void main(String[] args) {
        String s = "shivam";
        print(s);
        }


    public static void print(String s) {
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                System.out.println(s.substring(i, j));
            }
            System.out.println();
        }
    }
}
