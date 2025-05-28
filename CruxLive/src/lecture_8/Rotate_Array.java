package CruxLive.src.lecture_8;
import java.util.Scanner;
public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
    }

    public static void Rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int item = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            arr[i + 1] = arr[i];
        }
        arr[0] = item;
    }
}
