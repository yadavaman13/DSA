import java.util.*;

public class transposeMatrix {

    //function to transpose the matrix
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int transpose[][] = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the size of column: ");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int transposedMatrix[][] = transpose(arr);

        System.out.println("Transposed Matrix:");
        for(int i=0; i<transposedMatrix.length; i++){
            for(int j=0; j<transposedMatrix[0].length; j++){
                System.out.print(transposedMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
