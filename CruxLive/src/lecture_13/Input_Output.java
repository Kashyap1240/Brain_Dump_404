package CruxLive.src.lecture_13;
import java.util.Scanner;
public class Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        // takeing input in array
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Display(arr);

    }

    public static void Display(int[][] arr){
        // printing elements of array
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(); // change line wrt to every coloumn
        }
    }
}
