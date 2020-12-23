import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean nextToEachOther = true;
        int sizeArray = scanner.nextInt();
        int[] myArray = new int[sizeArray];
        for (int i = 0; i <= sizeArray - 1; i++) {
            myArray[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i <= myArray.length - 1; i++) {
            if (myArray[i] == n && myArray[i - 1] == m || myArray[i] == m && myArray[i - 1] == n) {
                nextToEachOther = false;
            }
        }
        System.out.println(nextToEachOther);
    }
}