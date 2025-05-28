package CruxLive.src.lecture_13;
import java.util.Scanner;
public class Tranpose_Square_Matrix {
    public static void main(String[] args) {
        int[][] arr = { { 2, 3, 1, 4 }, { 5, 6, 7, 9 }, { 8, 12, 11, 10 }, { 16, 15, 14, 13 } };
        Transpose(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Transpose(int[][] arr){

    }
}
