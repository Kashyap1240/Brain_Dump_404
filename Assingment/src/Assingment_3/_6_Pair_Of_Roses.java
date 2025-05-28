package Assingment.src.Assingment_3;
import java.util.*;
public class _6_Pair_Of_Roses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // no of test case
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            // corresponding to each input
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[i] = sc.nextInt();
            }
            // take target amount input
            int target = sc.nextInt();
            Arrays.sort(arr);

        }


    }
}
