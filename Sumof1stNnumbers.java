import java.util.Scanner;

public class Sumof1stNnumbers {
    public static int function(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        System.out.println("The sum is "+function(sc.nextInt()));
    }
}
