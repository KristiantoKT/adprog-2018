/**
 * 1st exercise.
 */
public class PrimeChecker {

    public static boolean isPrime(int number) {
        boolean divisible = false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                divisible = true;
                break;
            }
        }

        return number > 1 && !divisible;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(String.format("isPrime(%d)? %b", i, isPrime(i)));
        }
    }
}
