import java.util.Scanner;

public class electricitybill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total number of units consumed: ");
        int totalUnits = scanner.nextInt();
        
        double rate1 = 0.5;
        double rate2 = 0.75;
        double rate3 = 1.0; 
        
        double bill = 0;
        
        if (totalUnits <= 100) {
            bill = totalUnits * rate1;
        } else if (totalUnits <= 200) {
            bill = (100 * rate1) + ((totalUnits - 100) * rate2);
        } else {
            bill = (100 * rate1) + (100 * rate2) + ((totalUnits - 200) * rate3);
        }
        
        System.out.println("The total electricity bill is: $" + bill);
        
        scanner.close();
    }
}
