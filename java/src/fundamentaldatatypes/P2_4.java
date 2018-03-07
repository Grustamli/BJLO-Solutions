/*

Write a program that prompts the user for two integers and then prints
• The sum
• The difference
• The product
• The average
• The distance (absolute value of the difference)
• The maximum (the larger of the two)
• The minimum (the smaller of the two)
Hint: The max and min functions are declared in the Math class.

 */

package fundamentaldatatypes;

import java.util.Scanner;

public class P2_4 {
    public static void main(String[] args) {

        // Read inputs
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers");
        System.out.print("First: ");
        int first = in.nextInt();
        System.out.println();
        System.out.print("Second: ");
        int second = in.nextInt();

        // Operations
        final int sum = first + second;
        final int difference = first - second;
        final int product = first * second;
        final float average = (float) ((sum)/2.0);
        final int distance = Math.abs(difference);
        final int max = Math.max(first, second);
        final int min = Math.min(first, second);

        // Print results
        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("average = " + average);
        System.out.println("distance = " + distance);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
