//rotated binary search with duplicates elements

public class rotatedBinarySearchD {
    public static void main(String[] args) {
        int[] arr = {2,1,2,0,2}; 
        int target = 0;
        System.out.println(search(arr, target));
    }

    //search function
    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // If pivot is not there, means array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // If pivot is found
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    //binary search
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // Find pivot 
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //skip 1st and last element
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){

            if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

            if(arr[end] < arr[end-1]){
                return end-1;
            }
            end--;
            }

            //left side is sorted, so the pivot element is in right side
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
