package CruxLive.src.lecture_10;

public class Binary_Demo {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 11, 13, 16, 17, 18 };
        int target = 13;
        System.out.println(Search(arr, target));
    }

    public static int Search(int[] arr, int target){
        int lo = 0;
        int hi = arr.length-1;
        while(lo < hi){
            int mid = (lo + hi)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }
}

