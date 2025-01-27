//CI = P(1 + (r/12))^12t - P

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount, Rate of Interest, time period : ");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int n = 12; // 12 years

        double ci = p * (Math.pow((1 + (r/n)),n*t)) - p;
        System.out.println("Compound Interest : "+ci);
    }
}
