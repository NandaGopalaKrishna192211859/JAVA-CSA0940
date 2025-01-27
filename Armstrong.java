import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int n){
        int digits = 0;
        int temp = n;
        while(n!=0){
            n = n/10;
            digits++;
        }
        n = temp;
        double sum = 0;
        while(temp != 0){
            int x = temp % 10;
            sum = sum + (Math.pow(x,digits));
            temp /=10;
        }
        if(sum == n){
            return true;
        }
        return false;
    }               
}
