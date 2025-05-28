package CruxLive.src.lecture_8;

public class Rain_Water_Trapping {
    public static void main(String[] args) {
        int[] arr  = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(Trapping(arr));
    }

    public static int Trapping(int[] arr){
        // create left array
        int[] left = new int[arr.length];
        left[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }

        // create right array
        int[] right = new int[arr.length];
        right[right.length - 1] = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }

        //  storing water
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += Math.min(left[i],right[i]) - arr[i];
        }

        return sum;
    }
}
