import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numOne = scanner.nextLong();
        String operator = scanner.next();
        long numTwo = scanner.nextLong();

        switch (operator) {
            case "+":
                System.out.println(numOne + numTwo);
                break;
            case "-":
                System.out.println(numOne - numTwo);
                break;
            case "/":
                if (numTwo != 0) {
                    System.out.println(numOne / numTwo);
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            case "*":
                System.out.println(numOne * numTwo);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}