
/*

Enhance the output of Exercise P2.4 so that the numbers are properly aligned

 */

package fundamentaldatatypes;

import java.util.Scanner;

public class P2_5 {

    public static void main(String[] args) {
        // Read inputs
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers");
        System.out.print("First: ");
        int first = in.nextInt();
        System.out.println();
        System.out.print("Second: ");
        int second = in.nextInt();
        System.out.println();

        // Operations
        final int sum = first + second;
        final int difference = first - second;
        final int product = first * second;
        final float average = (float) ((sum)/2.0);
        final int distance = Math.abs(difference);
        final int max = Math.max(first, second);
        final int min = Math.min(first, second);

        // Print results4
        System.out.println("Sum:            " + sum);
        System.out.println("Difference:     " + difference);
        System.out.println("Product:        " + product);
        System.out.println("Average:        " + average);
        System.out.println("Distance:       " + distance);
        System.out.println("Max:            " + max);
        System.out.println("Min:            " + min);
    }

}
