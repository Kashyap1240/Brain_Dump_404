package CruxLive.src.lecture_7;
import java.util.Scanner;
public class Reverse_Inplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Before reversal
        System.out.println("----Before Reversal----");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        // Swap fun call
        System.out.println();
        Swap(arr);
        // after reversal
        System.out.println("----After Reversal----");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    // 2 pointer approach
    public static void Swap(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
