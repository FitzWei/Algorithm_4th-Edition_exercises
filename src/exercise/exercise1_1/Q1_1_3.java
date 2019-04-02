package exercise.exercise1_1;


import edu.princeton.cs.algs4.StdOut;

/**
 * get 3 parameters from the console, and calculate if they equal to each other
 */
public class Q1_1_3 {
    public static boolean IsEqual(int a, int b, int c)
    {
        if( a == b && b == c )
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean ret = IsEqual( Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]) );
        if( ret )
        {
            StdOut.println("equal");
        }
        else {
            StdOut.println("not equal");
        }
    }
}
