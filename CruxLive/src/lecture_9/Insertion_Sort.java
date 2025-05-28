package CruxLive.src.lecture_9;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,7,8,9,11,4};

    }

    public static void Sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            InsertLastElement(arr, i);
        }
    }

    public static void InsertLastElement(int[] arr, int i){
        int j = i - 1;
        int item = arr[i];
        while(j >= 0 && arr[j] > item){
            arr[j + 1] = arr[j];
            arr[j] = item;
            j--;
        }
        //return j + 1
    }
}
