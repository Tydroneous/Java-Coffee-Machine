import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long num = 1;

        if (n == 0) {
            num = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                num *= i;
            }
        }

        return num;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}