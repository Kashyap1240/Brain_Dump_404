package CruxLive.src.lecture_7;
import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 10, 20, 30, 4, 7 };
        int target = 30;
        System.out.println(Linear_Srch(arr, target));

    }

    public static int Linear_Srch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
