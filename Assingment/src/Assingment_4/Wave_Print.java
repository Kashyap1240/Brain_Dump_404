package Assingment.src.Assingment_4;
import java.util.Scanner;
public class Wave_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // print row wise
        Print(arr, row, col);

    }

    public static void Print(int[][] arr, int row, int col){
        // print row wise
        for(int i = 0; i < row; i++){
            if(i % 2 == 0){
                // print col even col
                for(int j = 0; j < col; j++){
                    System.out.print(arr[i][j]+", ");
                }
            } else {
                // print odd col
                for(int j = col - 1; j >= 0; j--){
                    System.out.print(arr[i][j]+", ");
                }
            }
        }
        System.out.print("END");
    }
}
