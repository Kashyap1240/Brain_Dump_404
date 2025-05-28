package CruxLive.src.lecture_2;

public class Pattern_4 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n-1;
        while(row <= n){
            // space preparation
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            // star preparation
            int j = 1;
            while(j <= star){
                System.out.print("* ");
                j++;
            }
            // next line preparation
            System.out.println();
            row++;
            star++;
            space--;
        }

        // star preparation
    }
}
