//longest subarray with sum <=k

public class longestSub {

    //Brute force - O(n^2)
    public static int longestBrute(int[] arr, int k){
        int n = arr.length;
        int maxLen = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += arr[j];
                if(sum <= k){
                    maxLen = Math.max(maxLen, j-i+1);
                }
                else if(sum > k){
                    break;
                }
            }
        }
        return maxLen;
    }

    //better approach
    public static int longestBetter(int[] arr, int k){
        int n = arr.length;
        int maxLen = 0;
        int l=0, r=0;
        int sum = 0;

        while(r<n){
            sum += arr[r];            

            while(sum > k){
                sum -= arr[l];
                l++;
            }

            if(sum <= k){
                maxLen = Math.max(maxLen, r-l+1);
                r++;
            }
        }
        return maxLen;
    }

     

    public static void main(String[] args) {
        int[] nums = {2,5,1,7,10};
    }
}
