package Assingment.src.Assingment_2;
import java.util.Scanner;
public class Sum_Op_And_Ep_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int osum = 0;
        int esum = 0;
        int count = 1;
        while(n > 0){
            int digit = n % 10;
            if(count % 2 != 0){
                osum += digit;
            } else {
                esum += digit;
            }
            count++;
            n = n / 10;
        }
        System.out.println(osum);
        System.out.println(esum);
    }
}
