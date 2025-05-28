package Assingment.src.Assingment_3;
import java.util.*;
public class _10_Square_Of_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(Square(arr));
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static int[] Square(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }
}
