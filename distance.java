import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 points : ");
        System.out.println("Point 1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Point 2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("The Distance is "+ Math.sqrt( Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)));
    }
}
