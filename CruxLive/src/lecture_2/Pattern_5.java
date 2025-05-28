package CruxLive.src.lecture_2;

public class Pattern_5 {
    public static void main(String[] args) {
         int n = 5;
         int row = 1;
         int star = n;
         int space = 0;
         while(row <= n){
             // star
             int i = 1;
             while(i <= star){
                 System.out.print("* ");
                 i++;
             }
             // next line preparation
             System.out.println();
             star--;
             row++;
             space++;
             // space
             int j = 1;
             while(j <= space){
                 System.out.print("  ");
                 j++;
             }

         }
    }
}
