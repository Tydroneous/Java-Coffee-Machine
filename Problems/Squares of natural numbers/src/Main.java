import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int squareValue = 0;
        for (int i = 1; i <= input; i++) {
            squareValue = i * i;
            if (squareValue <= input) {
                System.out.println(squareValue);
            } else {
                break;
            }
        }
    }
}