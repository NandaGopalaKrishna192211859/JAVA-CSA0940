import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter the Number : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum  = 0;
        int temp = num;
        while(num!=0){
            int k = num%10;
            sum = sum*10 + k;
            num/=10;
        }

        if(temp == sum){
            System.out.println("Yes Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

        
    }
}
