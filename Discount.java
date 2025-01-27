import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price : ");
        int n = sc.nextInt();
        System.out.println("Enter the discount : ");
        int d = sc.nextInt();

        System.out.println("Discount Applied : $" + (float)( n - (d * 0.01 * n)));
    }
}
