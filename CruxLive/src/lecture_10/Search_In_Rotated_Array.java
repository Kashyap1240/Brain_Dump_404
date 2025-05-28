package CruxLive.src.lecture_10;
import java.util.*;
public class Search_In_Rotated_Array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(Search(arr, target));
    }
    public static int Search(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(arr[mid] == target){
                return mid;
            }
            // if not at mid the, find weather in upper or in lower line
            // upper line
            else if(arr[mid] >= arr[lo]){
                if(arr[lo] <= target && target < arr[mid]){
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            // lower line
            else {
                if(arr[hi] >= target && target > arr[mid]){
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}
