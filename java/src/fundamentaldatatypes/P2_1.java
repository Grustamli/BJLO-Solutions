/*

Write a program that displays the dimensions of a letter-size (8.5 × 11 inches) sheet
of paper in millimeters. There are 25.4 millimeters per inch. Use constants
and comments
in your program.

 */

package fundamentaldatatypes;

public class P2_1 {
    public static void main(String[] args) {
        final float millisPerInch = 25.4f; // Millimeters per inch
        final float widthInInch = 8.5f; // Lettersize width in inch
        final float lengthInInch = 11f; // Lettersize length in inch
        final float widthInMillis = widthInInch * millisPerInch; // Lettersize width in millis
        final float lengthInMillis = lengthInInch * millisPerInch; // Lettersize length in millis

        System.out.println("Dimensions in millimeter: " + widthInMillis + " x " + lengthInMillis + " millimeters ");
    }
}
