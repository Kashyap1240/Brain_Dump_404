package CruxLive.src.lecture_16;

public class Sub_Array_Prod_Less_Then_k {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2};
        int k = 10;
        System.out.println(Product_Less_Than_K(arr,k));
    }

    public static int Product_Less_Than_K(int[] arr, int k){
        int ans = 0;
        int ei = 0, si = 0, p = 1;
        while(ei < arr.length){
            // window grow
            p = p * arr[ei];

            // window shrink
            while(p >= k && si <= ei){
                p /= arr[si];
                si++;
            }
            // ans calculate
            ans += (ei-si+1);
            ei++;
        }
        return ans;
    }
}
