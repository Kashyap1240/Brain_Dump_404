package CruxLive.src.lecture_13;
import java.util.Scanner;
public class Wave_Print {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8},{9, 10, 11, 12}};
        Print(arr);
    }
    public static void Print(int[][] arr){
        for(int i = 0; i < arr[0].length; i++){ // corr to every column
            if(i % 2 == 0){
                for(int j = 0; j < arr.length; j++){  // corr to every even row
                    System.out.print(arr[j][i]+" ");
                }
            } else {
                for(int j = arr.length-1; j >= 0; j--){ // corr to every odd row
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }
}
