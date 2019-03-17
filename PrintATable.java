package printatable;

import java.util.Scanner;

public class PrintATable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        Prompt the user to enter a nubmer as the range of the nubmers to calculate with.
        System.out.println("Enter the range of numbers you'd like to calculate...");
        int numbersRange = input.nextInt();

//       Prompt the user to engter a value as the range of the power to calculate the numbers with.
        System.out.println("Enter the range of powers you'd like to calculate...");
        int powerRange = input.nextInt();

//         Apply a restriction to the range of the number.
        while (powerRange >= 7) {

            System.out.println("You're not allowed to enter the power number greater than 6\nTry again...");

            powerRange = input.nextInt();
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
