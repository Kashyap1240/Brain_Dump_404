package Assingment.src.Assingment_4;
import java.util.Scanner;
public class Upper_Triangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        /// print upper triangular
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(i > j){
                    System.out.print(0+" ");
                } else {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
