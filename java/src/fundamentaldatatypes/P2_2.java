/*

Write a program that computes and displays the perimeter of a letter-size (8.5 × 11
inches) sheet of paper and the length of its diagonal.

 */

package fundamentaldatatypes;

public class P2_2 {

    public static void main(String[] args) {
        final float width = 8.5f;
        final float length = 11f;
        final float perimeter = 2 * (width + length);
        final double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));

        System.out.println("perimeter = " + perimeter);
        System.out.println("diagonal = " + diagonal);
    }

}
