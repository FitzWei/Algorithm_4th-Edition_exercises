package exercise.exercise1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author fitz
 * print the content of the transposed matrix
 */
public class Q1_1_13 {
    public static void printTransposedMatrix(Object[][] matrix)
    {
        //transpose the matrix
        Object[][] transposedMatrix = new Object[matrix[0].length][matrix.length];
        for( int i = 0; i < transposedMatrix.length; i++ )
        {
            for( int j = 0; j < transposedMatrix[0].length; j++ )
            {
                transposedMatrix[i][j] = matrix[j][i];
                StdOut.printf("%4s",transposedMatrix[i][j]);
            }
            StdOut.println();
        }

    }

    public static void main(String[] args) {
        Object[][] matrix = {{1,2,3},{4,5,6}};
        printTransposedMatrix(matrix);
    }
}
