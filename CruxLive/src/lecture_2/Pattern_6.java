package CruxLive.src.lecture_2;

public class Pattern_6 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 5;
        int space = 0;
        while(row <= n) {
            // space
            int j = 1;
            while(j <= space){
                System.out.print("  ");
                j++;
            }
            // star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            // next line preparation
            System.out.println();
            row++;
            space+=2;
            star--;
        }
    }
}
