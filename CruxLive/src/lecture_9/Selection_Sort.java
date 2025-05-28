package CruxLive.src.lecture_9;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = { 4, -1, 5, 3, 2, 1, 7 };
        Sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // for sorting
    public static void Sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int mini = min_from_ith_index(arr, i);
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }

    // find minimum index from i-th index
    public static int min_from_ith_index(int[] arr, int idx){
        int mini = idx;
        for(int i = idx + 1; i < arr.length; i++){
            if(arr[i] < arr[mini]){
                mini = i; // return index
            }
        }
        return mini;
    }

}
