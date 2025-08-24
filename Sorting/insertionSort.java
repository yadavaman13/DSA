public class insertionSort {
    
    //insertion sort function
    public static void iSort(int[] arr){
        int n = arr.length;

        for(int j=1; j<n; j++){
            int key = arr[j];

            int i = j-1;

            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }

        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    }  
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};  
        iSort(arr);
    }
}
