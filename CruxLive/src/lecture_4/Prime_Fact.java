package CruxLive.src.lecture_4;

public class Prime_Fact {
    public static void main(String[] args) {
        int n = 378;
        int i = 2;
        while(i <= n){
            if(n % i ==0){
                System.out.print(i+",");
                n = n /i;
            }else{
                i++;
            }
        }
    }
}
