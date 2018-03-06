/*

•• P 1.4 Write a program that prints the balance of an account after the first, second, and
third year. The account has an initial balance of $1,000 and earns 5 percent interest
per year.

*/

package introduction;

public class P1_4 {

    public static void main(String[] args) {
        double interestRate = 0.05;
        int initialBalance = 1000;
        double firstYear = initialBalance + (initialBalance * interestRate);
        double secondYear = firstYear + (firstYear * interestRate);
        double thirdYear = secondYear + (secondYear * interestRate);

        System.out.println("firstYear = " + firstYear);
        System.out.println("secondYear = " + secondYear);
        System.out.println("thirdYear = " + thirdYear);
    }
}
