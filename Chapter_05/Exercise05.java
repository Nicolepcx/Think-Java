**/
* Recursive Method Exercise 5-5 Think Java.
**/


public class Exercise05 {

public static void countdown(int n) {
    if (n == 0) {
        System.out.println("No bottles of beer on the wall!");
    } else {
        System.out.println(n + " bottles of beer on the wall");
        countdown(n - 1);
    }
}




