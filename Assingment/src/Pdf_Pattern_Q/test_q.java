package Assingment.src.Pdf_Pattern_Q;
import java.util.*;
public class test_q {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = arr.length; // Size of matrix

        System.out.println("Anti-Diagonal Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the element is on the anti-diagonal
                if (i + j == n - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}