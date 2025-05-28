package CruxLive.src.lecture_2;

public class pattern_1 {
    public static void main(String[] args) {
        int n = 5;   // maximum number of entry in a row
        int row = 1;  // put total numbers of rows
        int star = n; // es me, always put 1st row ka star
        while(row <= n){
            int i = 1;
            while(i <= star){
                System.out.print("*  ");
                i++;
            }
            // next row preparation
            System.out.println();
            row++;

        }
    }
}
