import java.util.Scanner;

public class commisionEarned {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the commision Earned : ");
        double ce = sc.nextDouble();
        System.out.println("enter total sales : ");
        double sales = sc.nextDouble();

        System.out.println("Commision Earned : " + (double)((ce/sales)*100));
    }
}
