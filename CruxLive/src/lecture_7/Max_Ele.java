package CruxLive.src.lecture_7;

public class Max_Ele {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 4, 7 };
        System.out.println(Largest(arr));
    }

    public static int Largest(int[] arr){
        int max = arr[0];
    //  int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
