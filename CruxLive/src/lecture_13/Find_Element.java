package CruxLive.src.lecture_13;
import java.util.Scanner;
public class Find_Element {
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int item = 23;
        System.out.println(Search(arr, item));
    }

    public static boolean Search(int[][] arr, int item){
        int row = 0;
        int col = arr[0].length - 1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == item){
                return true;
            }
            else if(arr[row][col] > item){
                col = col - 1;
            }
            else {
                row = row + 1;
            }
        }
        return false;
    }
}
