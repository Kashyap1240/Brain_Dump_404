package CruxLive.src.lecture_1;

public class Lottery_Game {
    public static void main(String[] args) {
        int n = 61;
        if (n >= 15 && n <= 20){
            System.out.println("BIKE");
            if (n >= 15 && n <= 18) {
                System.out.println("Hero Bike");
            } else {
                System.out.println("KTM Bike");
            }
        } else if (n >= 50 && n <= 80){
            System.out.println("CYCLE");
            if (n >= 50 && n <= 70) {
                System.out.println("Electric Cycle");
            } else{
                System.out.println("Manual Cycle");
            }
        } else if (n >= 100 && n <= 200){
            System.out.println("CAR");
            if (n >= 100 && n <= 151) {
                System.out.println("THAR");
            } else {
                System.out.println("CRETA");
            }
        } else if (n >= 250 && n <= 300){
            System.out.println("MAC");
            if (n >= 250 && n <= 261) {
                System.out.println("M1");
            } else{
                System.out.println("M2");
            }
        } else if (n >= 1200 && n <= 1400){
            System.out.println("Kur-Kure");
        } else{
            System.out.println("Happy Birthday");
        }
    }
}
