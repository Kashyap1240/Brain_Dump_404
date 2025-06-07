package CruxLive.src.lecture_13;

public class Sprial_Matrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 },{9,10,11,12} };
        Print(arr);

        // keep track of count in each inner loop
        // else it will print last element two times in a non square matrix
    }

    public static void Print(int[][] arr){
        int minR = 0;
        int maxR = arr.length - 1;
        int minC = 0;
        int maxC = arr[0].length - 1;

        int total_ele = arr.length * arr[0].length;
        int count = 0; // for outer loop condition

        while(count < total_ele){
            // for first row
            for(int i = minC; i <= maxC; i++){
                System.out.print(arr[minR][i]+" ");
                count++;
            }
            minR++;

            // for last column
            for(int i = minR; i <= maxR; i++){
                System.out.print(arr[i][maxC]+" ");
                count++;
            }
            maxC--;

            // for last row in reverse
            for(int i = maxC; i >= minC; i--){
                System.out.print(arr[maxR][i]+" ");
                count++;
            }
            maxR--;

            // for very first row in reverse
            for(int i = maxR; i >= minR; i--){
                System.out.print(arr[i][minC]+" ");
                count++;
            }
            minC++;
        }
    }
}
