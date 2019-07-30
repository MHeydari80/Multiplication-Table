package squaretable;

import java.util.Scanner;

public class SquareTable {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        //        Prompt the user to enter a nubmer as the range of the nubmers to calculate with.
        System.out.print("Numbers range ==>\t");
        int numbersRange = INPUT.nextInt();
        //       Prompt the user to engter a value as the range of the power to calculate the numbers with.
        System.out.print("Power range ==>\t\t");
        int powerRange = INPUT.nextInt();

        displaySquareTable(numbersRange, powerRange);

    }

    public static void displaySquareTable(int numbersRange, int powerRange) {

        //         Apply a restriction to the range of the number.
        while (powerRange >= 7) {

            System.out.println("You're not allowed to enter the power number greater than 6\nTry again...");

            powerRange = INPUT.nextInt();
        }

        System.out.println("a\t\t\t");

//          Prints out the row of the table.
        System.out.print("a\t\t\t");
        for (int i = 2; i <= powerRange; i++) {

            System.out.format("a^%d\t\t\t", i);

        }

        System.out.println("");

//          Prints out the result.
        for (int i = 0; i <= numbersRange; i++) {

            for (int j = 1; j <= powerRange; j++) {

                System.out.format("%d\t\t\t", (int) Math.pow(i, j));

            }
            System.out.println("");
        }
    }

}
