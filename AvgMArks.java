import java.util.ArrayList;
import java.util.Scanner;

public class AvgMArks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(6);
        System.out.println("Enter the Marks in a Sem [ M, P, C ][out of 100] : ");
        
        int sum = 0;
        for(int i = 0; i < 3; i++){
            arr.add(sc.nextInt());
            sum = sum + arr.get(i);
        }
        System.out.println("Average: " + sum/3.0f);
    }
}
