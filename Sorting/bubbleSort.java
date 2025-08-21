public class bubbleSort {

    public static void bSort(int[] arr){
        int n = arr.length;
        int i = n - 1;
        while(i >= 1){
            int j = 0;
            while(j<i){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else{
                    j++;
                }
            }
            i--;
        }
        
        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    } 
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        bSort(arr);
    }
}

