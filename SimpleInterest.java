import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter the Details : [P,T,R] : ");
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();

        System.out.println((float)(p*t*r)/100);
    }
}
