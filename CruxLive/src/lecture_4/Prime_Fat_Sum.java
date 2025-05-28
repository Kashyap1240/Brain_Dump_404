package CruxLive.src.lecture_4;
import java.util.Scanner;
public class Prime_Fat_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 2;
        while(i <= n){
            if(n % i == 0){
                sum += i;
                n = n / i;
            } else {
                i++;
            }
        }
        System.out.print(sum);
    }
}
