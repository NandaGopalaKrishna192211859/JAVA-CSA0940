import java.util.Scanner;

public class depreciation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value at Certain Time, End Year and Rate % value : ");
        int v = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();

        float d = (float)(v * Math.pow((1-r/100), t));
        System.out.println("Result : "+d);
    }
}