public class matrixMultiply{
    public static void main(String[] args) {
        int[][] a = {{1, 2},{3, 4}};
        int[][] b = {{1, 2},{3, 4}};
        int[][] c = new int[2][2];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                c[i][j]=a[i][j]*b[j][i];
            }
        }

    }
}