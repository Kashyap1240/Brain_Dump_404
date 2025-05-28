package CruxLive.src.lecture_17_Recursion;

public class Fact_Tail {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n,1));
    }

    public static int Fact(int n, int ans){
        // base case
        if(n == 0){
            return 1;
        }
        return Fact(n-1, ans * n);   // converted to tail recursion  ?
    }
}
