package Assingment.src.Assingment_4;
import java.util.Scanner;
public class Matrix_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(Search(arr, target));
    }

    public static int Search(int[][] arr, int item){
        int row = 0;
        int col = arr[0].length - 1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == item){
                return 1;
            }
            else if(arr[row][col] > item){
                col--;
            } else {
                row++;
            }
        }
        return 0;
    }
}
