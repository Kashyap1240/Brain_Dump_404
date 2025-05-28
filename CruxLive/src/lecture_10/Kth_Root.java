package CruxLive.src.lecture_10;
import CruxLive.src.lecture_8.Rotate_Array;

import java.util.Scanner;
public class Kth_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 3;
        int n = 149;
        System.out.println(Kthroot(n, k));
    }

    public static int Kthroot(int n, int k) {
        int lo = 1;
        int hi = n;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                lo = mid + 1;  /// to maximise the x value
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
