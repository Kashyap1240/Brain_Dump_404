package CruxLive.src.lecture_7;

public class Array_Swao_Demo1 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 67, 8};
        System.out.println(arr[0]+" "+arr[1]);
        Swap(arr[0], arr[1]);
        // changes in locak variable will not be refelected gloablly
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
