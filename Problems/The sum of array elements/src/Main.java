import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = scanner.nextInt();

        int[] myArray = new int[input];

        for (int i : myArray) {
            myArray[i] = scanner.nextInt();
            sum += myArray[i];
        }
        System.out.println(sum);
    }
}