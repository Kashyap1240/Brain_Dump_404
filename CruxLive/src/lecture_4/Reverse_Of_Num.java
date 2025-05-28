package CruxLive.src.lecture_4;
import java.util.Scanner;
public class Reverse_Of_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nnum = 0;
        while(num > 0){
            int rem = num % 10;
            nnum = nnum * 10 + rem;
            num = num / 10;
        }
        System.out.println(nnum);
    }
}
