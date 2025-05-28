package Assingment.src.Assingment_2;
import java.util.Scanner;
public class Simple_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int csum = 0;
        // till csum is not negative add that input
        while(csum >= 0){
            int n = sc.nextInt();
            csum += n;
            if(csum < 0){
                return;
            } else {
                System.out.println(n);
            }
        }
    }

}
