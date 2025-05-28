package Assingment.src.Assingment_3;
import java.util.*;
public class _5_Max_Value_In_Array {
    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // find the max in the array
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        // now print max ele
        System.out.println(max);
    }
}
