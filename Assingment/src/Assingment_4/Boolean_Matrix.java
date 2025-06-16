package Assingment.src.Assingment_4;
import java.util.Scanner;

public class Boolean_Matrix {
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

        boolean[] row = new boolean[M];
        boolean[] col = new boolean[N];

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(arr[i][j] == 1){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(row[i] || col[j]){
                    arr[i][j] = 1;
                }
            }
        }

        // Print the result
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}