//Given an array arr, return the index of peak element

public class peakElement {
    
    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end  = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,4,3,2,1};
        System.out.println(findPeak(arr));
    }
}
