package CruxLive.src.lecture_17_Recursion;

public class Sum {
    public static void main(String[] args) {
        int n = 5;
      // System.out.println(Rsum(n, 0));
        System.out.println(SUM(n));
    }

//    public static int Rsum(int n, int sum){
//        if(n == 0){
//            return sum;
//        }
//        return Rsum(n-1, sum + n);
//    }

     public static int SUM(int n){
        if(n == 1){
            return 1;
        }
        int sum = SUM(n-1);
        return sum + n;
     }
}

