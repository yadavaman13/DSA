//basic binary search code to find the target index

public class bSearch{

    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        
        while(start <= end){
            mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,10,11};
        System.out.println(binarySearch(arr, 5));
    }
}