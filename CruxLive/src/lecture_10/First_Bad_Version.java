package CruxLive.src.lecture_10;

public class First_Bad_Version {
    public static void main(String[] args) {

    }

    public static int firstBad(int n){
        int lo = 1;
        int hi = n;
        int ans = 0;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(isBadversion(mid) == true){
                ans = mid;
                hi = mid - 1; // beacuse we need to find the minimum
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }


    // false function; inbuilt on leetcode
    public static boolean isBadversion(int mid){
        return false; // let say
    }
}
