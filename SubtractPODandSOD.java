//subtract product of digits and sum of digits

import java.util.Scanner;

public class SubtractPODandSOD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer : ");
        int n = sc.nextInt();
        int prod = 1;
        int sum = 0;

        while(n!=0){
            int k = n%10;
            prod = prod * k;
            sum = sum + k;
            n = n / 10;
        }

        System.out.println("Product of Digits - Sum of Digits : "+ (prod - sum));
    }
}
