package CruxLive.src.lecture_17_Recursion;

public class Print_DEC {
    public static void main(String[] args) {
        int n = 5;
        PD(n);
    }

    public static void PD(int n){
        // base case
        if(n == 0){
            return;
        }

        System.out.println(n);
        PD(n-1);
    }
}
