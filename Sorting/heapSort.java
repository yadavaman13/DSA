public class heapSort {

    //heapify function
    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left<n && arr[left]>arr[i]){
            largest = left;
        }

        if(largest<n && arr[right]>arr[i]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }


    //heapsort function
    public static void hSort(int[] arr){
        int n = arr.length;

        for(int i=n/2 - 1; i>=0; i--){
            heapify(arr, n, i);
        }

        for(int i=n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, n, 0);
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};  
        hSort(arr);
    }
}
