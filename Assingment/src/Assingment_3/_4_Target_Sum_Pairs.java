package Assingment.src.Assingment_3;
import java.util.*;
public class _4_Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Pair(arr, target);
    }

    public static void Pair(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                System.out.println(arr[i]+" and "+arr[j]);
                i++;
                j--;
            } else if(sum < target){
                i++;
            } else {
                j--;
            }
        }
    }
}
