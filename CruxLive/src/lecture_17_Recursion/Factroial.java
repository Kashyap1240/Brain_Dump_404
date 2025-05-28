package CruxLive.src.lecture_17_Recursion;

public class Factroial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));
    }


    // this will give stack overflow
    public static int Fact(int n){
        // base case
        if (n == 0){
            return 1;
        }
        // small problem
        int f = Fact(n-1);
        return f * n;
    }
}
