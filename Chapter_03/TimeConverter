import java.util.Scanner;

/**
 * Converts a total number of seconds to hours, minutes, and seconds.
 */
public class TimeConverter {

    public static void main(String[] args) {
        int timeInput, seconds, minutes, hour;

        Scanner in = new Scanner(System.in);

        System.out.print("How many seconds would you like to convert? ");
        timeInput = in.nextInt();

        hour = timeInput / 3600;
        seconds = timeInput % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.printf("%d second(s) = %d hour(s), %d minute(s), and %d second(s)", timeInput, hour, minutes, seconds);


    }
}