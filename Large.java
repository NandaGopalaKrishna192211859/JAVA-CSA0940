import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers : ");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Maximum is " + Math.max(n1,n2));
    }
}
