package CruxLive.src.lecture_7;

public class Array_Swap_Demo2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 10, 20, 30, 4, 7 };
        System.out.println(arr[0] + " " + arr[1]);// 10 20
        Swap(arr, 0, 1);
        System.out.println(arr[0] + " " + arr[1]);//20 10

    }

    // Hence Java support call by reference/add not call by value
    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
