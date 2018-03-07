/*

Write a program that reads a number and displays the square, cube, and fourth
power. Use the Math.pow method only for the fourth power.

 */

package fundamentaldatatypes;

import java.util.Scanner;

public class P2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = in.nextDouble(); // read a number from console input
        double square = number * number;
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);

        System.out.println("square = " + square);
        System.out.println("cube = " + cube);
        System.out.println("fourthPower = " + fourthPower);
    }
}
