import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {

        int highestPosition;
        if (a >= b && a >= c) {
            highestPosition = 1;
        } else if (b >= a && b >= c) {
            highestPosition = 2;
        } else {
            highestPosition = 3;
        }
        return highestPosition;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}