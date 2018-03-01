/**
 * A short example class demonstrating how relational and conditional operators
 * work in Java. Outputs the result of each operation.
 *
 * @author Isaac Webb
 * @version 1.0
 */
public class Operators {

    /**
     * The method that will be run when the program is executed.
     *
     * @param args The command line arguments to the program
     */
    public static void main(String[] args) {
        // Relational operators
        System.out.println("1 == 2 : " + (1 == 2));
        System.out.println("1 == 1 : " + (1 == 1));

        System.out.println("2 != 3 : " + (2 != 3));
        System.out.println("2 != 2 : " + (2 != 2));

        System.out.println("3 <= 4 : " + (3 <= 4));
        System.out.println("3 <= 3 : " + (3 <= 3));
        System.out.println("3 <= 2 : " + (3 <= 2));

        System.out.println("4 >= 5 : " + (4 >= 5));
        System.out.println("4 >= 4 : " + (4 >= 4));
        System.out.println("4 >= 3 : " + (4 >= 3));

        System.out.println("5 < 6 : " + (5 < 6));
        System.out.println("5 < 5 : " + (5 < 5));

        System.out.println("6 > 7 : " + (6 > 7));
        System.out.println("6 > 6 : " + (6 > 6));
        System.out.println("6 > 5 : " + (6 > 5));

        // A few real examples with relational operators
        int grade = 91;
        boolean isAnA = grade >= 90; // true
        System.out.println("isAnA = " + isAnA);

        double height = 47.75;
        boolean isTallEnoughToRide = height >= 48;
        System.out.println("isTallEnoughToRide = " + isTallEnoughToRide);

        // An example using conditional operators
        boolean isSortaAB = grade >= 80; // true...?!?!
        System.out.println("isSortaAB = " + isSortaAB);

        boolean isAB = grade < 90 && grade >= 80; // false!
        System.out.println("isAB = " + isAB);
    }

}
