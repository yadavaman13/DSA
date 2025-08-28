import java.util.Arrays;

public class countingSort {
    public static void countingSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int n = arr.length;

        // Find min and max
        int min = arr[0], max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[n];

        // Count frequencies
        for (int i = 0; i < n; i++) {
            count[arr[i] - min]++;
        }

        // Cumulative sum
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build output array 
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy sorted values back
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -1, 7, 2, 0, -1, 5};
        countingSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

