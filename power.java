import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a power b is " + Math.pow(a,b));
    }
}
