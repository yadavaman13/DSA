public class selectionSort {

    //selection sort function
    public static void sSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                while(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    } 

    //main method
    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,1,2,3,4};
        sSort(arr);
    }
}
