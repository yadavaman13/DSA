//how to apply binary search in a array of infinite size


public class infiniteArray {
    
    //function to find the start and end index of the array
    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(end < arr.length && target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start +1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }


    //binary search function
    public static int binarySearch(int[] arr, int target, int start, int end){
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


    //main function
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,22,23,30};
        System.out.println(ans(arr, 15));
    }

}
