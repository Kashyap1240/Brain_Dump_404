package CruxLive.src.lecture_9;
public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        BSort(arr);
        for(int i = 1; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void BSort(int[] arr){
        // first loop to pick the element
        for(int  turn = 1; turn < arr.length; turn++){
            // second loop to compare it with remaning ele
            for(int i = 0; i < arr.length - turn ; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}
