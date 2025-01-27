import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        System.out.println("enter the currency in india : ");
        Scanner sc = new Scanner(System.in);

        float india = sc.nextFloat();

        System.out.println("USD : "+india/86.5);
    }
}
