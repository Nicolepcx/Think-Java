/**
 * Exercise 5-7  of Think Java.
 *
 * A recursive number guess game.
 *
 *
 */

import java.util.*;

public class Excercise07 {

    public static void main(String[] args) {
        int computerValue, userValue;

        // Generate computer value
        Random r = new Random();
        computerValue = r.nextInt(100) + 1;

        // Ask for user input
        Scanner in = new Scanner(System.in);
        System.out.println("I am thinking of a number between 1 and 100.");
        System.out.println("Type your guess: ");
        userValue = in.nextInt();

        // Display user's guess, computer's guess, and the difference

        System.out.println("Your guess is: " + userValue);
        System.out.println("You were off by " + Math.abs(userValue - computerValue));

        // Check difference
        isEqual(userValue, computerValue);
    }

    public static void isEqual(int userValue, int computerValue) {
        Scanner in = new Scanner(System.in);
        while (userValue != computerValue) {
            if (userValue < computerValue) {
                System.out.println("Too low! Enter another number: ");
                userValue = in.nextInt();
            } else if (userValue > computerValue) {
                System.out.println("Too high! Enter another number: ");
                userValue = in.nextInt();
            }

        }

        if (userValue == computerValue) {
                System.out.println("Cool, you got it right!");
        }
    }
}
