// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;
public class TakeUserIPtill0 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Numbers [0 to  quit] : ");
        int sum = 0;
        int max = 0;
        while(true){
            int n = sc.nextInt();
            if(n == 0){break;}
            sum = sum + n;
            max = Math.max(max,n);
        }
        System.out.println("sum is "+ sum);
        System.out.println("Max is "+ max);
    }
}
