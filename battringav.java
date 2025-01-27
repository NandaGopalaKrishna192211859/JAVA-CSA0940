import java.util.ArrayList;
import java.util.Scanner;

public class battringav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(6);
        System.out.println("Enter the Score in an Over : ");
        
        int sum = 0;
        for(int i=0;i<6;i++){
            arr.add(sc.nextInt());
            sum = sum + arr.get(i);
        }
        System.out.println("Average : "+sum/6);
    }
}
