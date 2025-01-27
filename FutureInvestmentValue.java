import java.util.Scanner;

// FV=PV×(1+r)^t
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial investment (Present Value): ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double interestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureValue = presentValue * Math.pow(1 + interestRate, years);

        System.out.printf("The future value of your investment is: %.2f", futureValue);
    }
}
