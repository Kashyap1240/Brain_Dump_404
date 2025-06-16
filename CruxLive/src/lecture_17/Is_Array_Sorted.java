package CruxLive.src.lecture_17_Recursion;

public class Is_Array_Sorted {
    public static void main(String[] args) {
        int[] arr = {5, 7, 80, 11, 15};
        System.out.println(Sorted(arr, 0));
    }

    public static boolean Sorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return Sorted(arr,i+1);
    }

}
