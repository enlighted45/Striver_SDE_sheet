
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                {0,2,0}};
        setZeros(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }



    }
    public static void setZeros(int matrix[][]) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        int i = matrix.length;
        int j = matrix[0].length;
        int[] row1 = new int[i];
        int[] col1 = new int[j];
        Arrays.fill(row1,0);
        Arrays.fill(col1,0);

        for (int rw = 0; rw < i; rw++) {
            for (int cl = 0; cl < j; cl++) {
                if (matrix[rw][cl]==0){
                    if ( row1[rw]==0 ){
                        row.add(rw);
                        row1[rw]=1;
                     }
                    if (col1[cl]==0){
                        col.add(cl);
                        col1[cl]=1;
                    }
                }
            }
        }
        for (int k = 0; k < row.size(); k++) {
            putzerorow(matrix,row.get(k));
        }
        for (int k = 0; k < col.size(); k++) {
            putzerocol(matrix, col.get(k));
        }

    }
    public  static void putzerorow(int[][] matrix , int row) {
        int j = matrix[0].length;
        for (int k = 0; k < j; k++) {
            matrix[row][k] = 0;
        }
    }
    public  static void putzerocol(int[][] matrix , int col) {
        int i = matrix.length;
        for (int k = 0; k < i; k++) {
            matrix[k][col] = 0;
        }
    }


}
