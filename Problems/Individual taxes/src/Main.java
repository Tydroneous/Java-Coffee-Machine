import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCompanies = scanner.nextInt();
        int highest = 0;
        int top = 0;
        double temp;
        double[] companyIncome = new double[numCompanies];
        double[] companyTaxes = new double[numCompanies];
        for (int i = 0; i <= companyIncome.length - 1; i++) {
            companyIncome[i] = scanner.nextInt();
        }
        for (int i = 0; i <= companyTaxes.length - 1; i++) {
            companyTaxes[i] = scanner.nextInt();
        }

        for (int i = 0; i <= companyIncome.length - 1; i++) {
            if (companyIncome[i] != 0 && companyTaxes[i] != 0) {
                temp = companyIncome[i] * (companyTaxes[i] / 100.0);
                if (temp > highest) {
                    highest = (int) temp;
                    top = i + 1;
                }
            }

        }
        System.out.println(top);
    }
}