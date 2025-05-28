package CruxLive.src.lecture_2;

public class Pattern_12 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space =  n - 1;
        while(row <= n){
            // space
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while(j <= star){
                if (j % 2 != 0){
                    System.out.print("* ");
                } else {
                    System.out.print("! ");
                }
                j++;
            }
            // next line preparation
            System.out.println();
            row++;
            star += 2;
            space--;
        }
    }
}
