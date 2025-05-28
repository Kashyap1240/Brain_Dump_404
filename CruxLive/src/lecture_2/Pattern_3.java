package CruxLive.src.lecture_2;

public class Pattern_3 {
    public static void main(String[] args) {
        int n = 5;       // total num of entries in each row (mtlb column)
        int row = 1;    // starting row
        int star = 5;   // number of stars in starting row
        while(row <= n){
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            // prep for next row
            System.out.println();
            row++;
            star--;

        }
    }
}
