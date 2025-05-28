package CruxLive.src.lecture_9;

public class maximum_subarray {
    public static void main(String[] args) {
      int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Sum(arr));
    }

    public static int Sum(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int turn = 0; turn < arr.length; turn++){
            int sum = 0;
            for(int i = turn; i < arr.length; i++){
                sum += arr[i];
                ans = Math.max(sum, ans);
            }
        }
        return ans;
    }
}
