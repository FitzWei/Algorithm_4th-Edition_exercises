package exercise.exercise1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * print the content of a two dimension boolean matrix
 */
public class Q1_1_11 {
    public static void printMatric( boolean[][] matrix )
    {
        // print the head
        for( int i = 0; i < matrix.length; i++ )
        {
            StdOut.print("\t"+i);
        }
        for (int i = 0; i < matrix.length; i++) {
            StdOut.print("\n"+i);    // print the index of column
            for ( int j = 0; j < matrix[i].length; j++ ) {
                if (matrix[i][j]) {
                    StdOut.printf("%4s", "*");
                } else {
                    StdOut.printf("%4s", " ");
                }
            }
        }

    }

    public static void main(String[] args) {
        boolean[][] testMatrix = {{true, true, false}, {false,true,true},{true,true,false}};
        printMatric(testMatrix);
    }

}
