package Assingment.src.Assingment_3;
import java.util.*;
public class _2_Target_Sum_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr); // sort the array
        Triplet(arr, target); // make fun call
    }

    public static void Triplet(int[] arr, int target){
        int n = arr.length - 1;
        for(int i = 0; i < n; i++){
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    // Skip duplicates for second and third elements
                    while(j < k && arr[j] == arr[j+1]) j++;
                    while(j < k && arr[k] == arr[k-1]) k--;
                    j++;
                    k--;
                } else if(sum < target){
                    j++;
                } else {
                    k--;
                }

            }
        }
    }
}
