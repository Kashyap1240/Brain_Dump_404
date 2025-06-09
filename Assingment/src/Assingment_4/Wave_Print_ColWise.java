package Assingment.src.Assingment_4;
import java.util.Scanner;
public class Wave_Print_ColWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Print(arr);
    }

    public static void Print(int[][] arr){
        for(int i = 0; i < arr[0].length; i++){
            if(i % 2 == 0){
                for(int j = 0; j < arr.length; j++){
                    System.out.print(arr[i][j]+", ");
                }
            } else {
                for(int j = arr.length - 1; j >= 0; j--){
                    System.out.print(arr[i][j]+", ");
                }
            }
        }
        System.out.println("END");
    }
}
