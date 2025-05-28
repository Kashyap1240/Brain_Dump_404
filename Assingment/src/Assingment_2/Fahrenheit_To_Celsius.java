package Assingment.src.Assingment_2;
import java.util.Scanner;
public class Fahrenheit_To_Celsius {
    public static void main(String[] args) {
        // take all inputs
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();

        // start form min, with given step count
        for(int i = min; i <= max; i += step){
            int Celsius = (5 * (i - 32)) / 9;// min = temp in Fahrenheit
            System.out.println(i+" "+Celsius);
        }
    }
}
