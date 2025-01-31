import java.util.ArrayList;
import java.util.Scanner;

public class PrimeinRange{
    public static boolean Prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> RangePrime(int a, int b){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=a;i<=b;i++){
            if(Prime(i) == true){
                arr.add(i);
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range : ");
        System.out.println("Prime are : "+RangePrime(sc.nextInt(), sc.nextInt()));

    }
}