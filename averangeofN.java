import java.util.Scanner;

public class averangeofN {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Numbers [-1 to  quit] : ");
        int sum = 0;
        int max = 0;
        int c = 0;
        while(true){
            int n = sc.nextInt();
            if(n == -1){break;}
            sum = sum + n;
            max = Math.max(max,n);
            c++;
        }
        System.out.println("Avg is "+ sum/c);
    }
}