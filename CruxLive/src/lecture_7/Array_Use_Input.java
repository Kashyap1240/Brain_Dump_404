package CruxLive.src.lecture_7;
import java.util.Scanner;
public class Array_Use_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // take inputs
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Display(arr);
    }

    // display entered values
    public static void Display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
