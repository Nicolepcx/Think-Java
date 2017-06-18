import java.util.Random;
import java.util.Scanner;

/**
 *  Guesses a random number between 1 and 100.
 */
public class GuessMyNumber
{
    public static void main(String[] args) {
        int guess, answer;

        Scanner in = new Scanner(System.in);

        // aks for a guess
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");

        guess = in.nextInt();

        // pick a random number
        Random random = new Random();
        answer = random.nextInt(100) + 1;

      System.out.printf("Your guess is: %d\n", guess);
      System.out.printf("The number I was thinking of is: %d\n", answer);
      System.out.printf("You were off by: %d\n", Math.abs(guess - answer));
    }

}
