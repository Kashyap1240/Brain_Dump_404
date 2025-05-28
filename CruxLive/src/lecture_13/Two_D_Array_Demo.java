package CruxLive.src.lecture_13;
import java.util.Scanner;
public class Two_D_Array_Demo {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        System.out.println(arr);  // add
        System.out.println(arr[1]); // add
        System.out.println(arr[1][2]); // element
        int[][] other = arr; // reference changed, no new array created

        // row length
        int row = arr.length;
        // col length
        int col = arr[0].length;
        System.out.println(row);
        System.out.println(col);
    }
}
