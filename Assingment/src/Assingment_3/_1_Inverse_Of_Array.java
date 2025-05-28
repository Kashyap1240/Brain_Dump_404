package Assingment.src.Assingment_3;
import java.util.Scanner;
public class _1_Inverse_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take inputs
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // inverse elements with index
        int[] temp = new int[size];
        for(int i = 0; i < arr.length; i++){
            int j = arr[i];
            temp[j] = i;
        }

        // print the array
        for(int k = 0; k < temp.length; k++){
            System.out.print(temp[k]+" ");
        }
    }


}
