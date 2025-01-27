import java.util.Scanner;

public class armstrong {
    
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int digits = 0;

        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        
        temp = num;
        while (temp != 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int start = sc.nextInt(), end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) System.out.println(i);
        }
    }
}
