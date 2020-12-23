import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char charLower = Character.toLowerCase(ch);
        if (charLower == 'a' || charLower == 'e' || charLower == 'i' || charLower == 'o' || charLower == 'u') {
            return true;
        } else {
            return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}