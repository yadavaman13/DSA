public class maxPoints {

    public static int maxSum(int[] nums, int k){
        int lSum=0, rSum=0, maxSum=0;
        int n = nums.length;

        for(int i=0; i<k; i++){
            lSum = lSum + nums[i];
            maxSum = lSum;
        }
        int rindex = n-1;

        for(int i=k-1; i>=0; i--){
            lSum = lSum - nums[i];
            rSum = rSum + nums[rindex];
            rindex--;
            maxSum = Math.max(maxSum, lSum + rSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = {6,2,3,4,7,2,1,7,1};
        System.out.println( maxSum(nums, 4));
    }
}
