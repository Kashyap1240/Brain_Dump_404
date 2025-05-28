package CruxLive.src.lecture_16;

public class Max_Sum_Of_Win {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,5,7,8,9,1};
        int k = 3;
        System.out.println(Maximum_Sum(arr,k));
    }
    public static int Maximum_Sum(int[] arr, int k){
        int ans = 0;
        int sum = 0;
        // 1st wind cal
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        ans = sum;
        for(int i = k; i < arr.length; i++){
            sum += arr[i]; // grow
            sum -= arr[i-k]; // shrink
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
