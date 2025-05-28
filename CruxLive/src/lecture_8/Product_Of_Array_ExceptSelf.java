package CruxLive.src.lecture_8;

public class Product_Of_Array_ExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] a = Product(arr);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static int[] Product(int[] arr){
        // left product
        int[] left = new int[arr.length];
        left[0] = 1;
        for(int i = 1; i < arr.length; i++){
            left[i] = left[i-1] * arr[i-1];
        }

        // left product
        int[] right = new int[arr.length];
        right[right.length - 1] = 1;
        for(int i = arr.length - 2; i >= 0; i--){
            right[i] = right[i+1] * arr[i+1];
        }

        // product kisi me v rakh lo
        for(int i = 0; i < arr.length; i++){
            left[i] = left[i] * right[i];
        }
        return left;
    }
}
