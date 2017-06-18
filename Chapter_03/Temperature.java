import java.util.Scanner;

/**
 * Converts Celsius in Fahrenheit.
 */

public class Temperature {

    public static void main(String args[]) {
        double celsius;
        double celsiusInFahrenheit;

        //Asks the user to input the Temperture in Celsius
        Scanner in = new Scanner(System.in);
        System.out.print("Input temperatur in Celsius: ");

        celsius = in.nextDouble();
        celsiusInFahrenheit = celsius * 9 / 5 + 32;

        //Prints out the Temperture in Fahrenheit.
        System.out.printf("%.1f C = %.1f F", celsius, celsiusInFahrenheit);
   }
}