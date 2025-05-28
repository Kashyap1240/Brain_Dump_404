package CruxLive.src.lecture_6;
    import java.util.Scanner;
    public class Shopping_Game {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t > 0){
                int m = sc.nextInt(); // Aayush max limit
                int n = sc.nextInt(); // Harshit max limit
                Shopping(n, m); // harshit then aayush
                t--;
            }

        }

        public static void Shopping(int n, int m){
            int phone = 1;
            int a = 0;
            int h = 0;
            while(true){
                a = a + phone;
                if(a > m){
                    System.out.println("Harshit");
                    break;
                }
                phone++;
                h = h + phone;
                if(h > n){
                    System.out.println("Aayush");
                    break;
                }
                phone++;
            }
        }
    }
