public class Excercixe04 {

private int a, b, c, n;

public static void main(String[] args) {
    checkFermat(6, 2, 3, 2);
}

public static boolean checkFermat(int a, int b, int c, int n) {
    if (n > 2 && ( (Math.pow(a, n) + Math.pow(b,n)) ) == Math.pow(c, n)) {
        System.out.println("Holy smockes, Fermat was wrong!");
        return false;
    } else {
        System.out.println("No, that doesn't work.");
        return true;
    }

}
}