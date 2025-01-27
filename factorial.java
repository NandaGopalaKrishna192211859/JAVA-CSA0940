import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial of Given number is " + fact(sc.nextInt()));
    }

    public static int fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
    
}
