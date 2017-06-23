
/**
* Integrate the exercise from 2-2 into it's own method. The method should take 4 parameter.
* A String for the day (e. g. "Monday"), an integer value for the date (e.g. 15)
* and a String for the month (e. g. "July") and finally a integer for the year (e. g. 2000).
*
 */

public class PrintAmerican
{
   /**
    * Print the date in American format.
    *
    * @param day
    * String with the day e.g. Monday
    *
    * @param date
    * Integer value ot the current day e.g. 15
    *
    * @param month
    * String of the month
    *
    * @param year
    * Integer value of the year
    */
   public static void printAmerican(String day, int date, String month, int year) {
       System.out.println("The date in American format: ");
       System.out.println(day + ", " + month + " " + date + ", " + year);
       System.out.println();
    }

   public static void printEuropean(String day, int date, String month, int year) {
       System.out.println("The date in European format: ");
       System.out.println(day + ", " + date + ". " + month + " " + year);
       System.out.println();
    }

    public static void main(String[] args) {
      printAmerican("Monday", 15, "July", 2000);
      printEuropean("Monday", 15, "July", 2000);
    }
}
