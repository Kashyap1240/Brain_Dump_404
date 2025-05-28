package CruxLive.src.lecture_4;
import java.util.Scanner;
public class Check_PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                count++;
                break; // used to break the remaining iteration
            }
        }
        if(count >= 1){
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
}
