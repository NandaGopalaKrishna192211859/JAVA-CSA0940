import java.util.Scanner;

public class NPRandNCR {

    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static float nCr(int n, int r){
        if(n>r){
            return fact(n)/(fact(r) * fact(n-r));
        }
        return 0;
    }

    public static float nPr(int n, int r){
        if(n>r){
            return fact(n)/fact(n-r);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r [ n > r ] : ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("nPr : "+ nPr(n,r));
        System.out.println("nCr : "+ nCr(n,r));
    }
}
