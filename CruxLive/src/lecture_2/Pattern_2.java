package CruxLive.src.lecture_2;

public class Pattern_2 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        while(row <= n){
            // star
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            //next line preparation
            System.out.println();
            row++;
            star++;

        }
    }
}
