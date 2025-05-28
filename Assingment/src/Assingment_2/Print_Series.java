package Assingment.src.Assingment_2;

import java.util.Scanner;

public class Print_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i = 1;
        int count = 0;

        // Generate the series
        while (count < n1) {
            int num = 3 * i + 2;
            if (num % n2 != 0) {
                System.out.println(num);
                count++;
            }
            i++;
        }
    }
}