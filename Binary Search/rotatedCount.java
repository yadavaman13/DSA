public class rotatedCount {

    //main
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};    
        System.out.println(countRotations(arr));
    }

    //counts rotations
    static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    //find pivot
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
