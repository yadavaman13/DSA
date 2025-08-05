//kadane's algorithm

public class subArray{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int start=0; start<n; start++){
            currSum += arr[start];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
               currSum = 0;
            }
        }//start for loop
        System.out.println(maxSum);
    }//main method
}//main class