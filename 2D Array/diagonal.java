import java.util.*;

public class diagonal {

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int total = 0;

        for(int i=0; i<n; i++){
            total += mat[i][i];
            total += mat[i][n-i-1];
        }

        if(n % 2 == 1){
            total -= mat[n/2][n/2];
        }
        
        return total;
    }

    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(arr));
    }
}
