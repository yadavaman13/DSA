public class constWindow{

    public static int window(int[] arr, int k){
        int l=0, r=0;
        int maxSum = 0;
        int n = arr.length;

        for(int i=0; i<n-k; i++){
            int sum = 0;
            for(int j=0; j<k; j++){
                sum += arr[i+j];
            }
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }

    public static void main(String args[]){
        int[] arr = {-1,2,3,3,4,5,1};
        System.out.println(window(arr,4));
    }
}