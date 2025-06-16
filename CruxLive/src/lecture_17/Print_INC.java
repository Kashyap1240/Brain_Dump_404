package CruxLive.src.lecture_17_Recursion;

public class Print_INC {
    public static void main(String[] args) {
        int n = 5;
        PI(5);
    }

    public static void PI(int n){
        // base case
        if(n == 0){
            return;
        }

        PI(n-1);
        System.out.println(n);
    }
}
