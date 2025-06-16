package Assingment.src.Assingment_4;
import java.util.Scanner;
public class Max_Col_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        // find sum column wise
        int Max_sum = Integer.MIN_VALUE;
        int index = 0;
        for(int j = 0; j < arr[0].length; j++) {
            int Curr_Sum = 0;
            for (int i = 0; i < arr.length; i++) {
                Curr_Sum += arr[i][j];
            }
            if (Curr_Sum > Max_sum) {
                Max_sum = Curr_Sum;
                index = j + 1;
            }
        }
        System.out.println();
        System.out.println(index+ " " + Max_sum);
    }
}
