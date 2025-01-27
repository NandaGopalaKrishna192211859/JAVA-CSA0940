import java.util.ArrayList;
import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of numbers : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter the Numbers : ");
        
        int sum = 0;
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
            sum = sum + arr.get(i);
        }
        System.out.println("Sum : "+sum);
    }
}
