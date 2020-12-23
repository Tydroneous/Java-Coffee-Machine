import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (true) {
            num = scanner.nextInt();
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            } else if (num == 0) {
                break;
            }
            else {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}