import java.util.Scanner;

public class surfaceareas {
    public static void CSAofCylinder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius and Height : ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Curved Surface Area of Cylinder: "+ (2 * Math.PI * r * h ));
    }
    public static void TSAofCube(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side : ");
        int r = sc.nextInt();
        System.out.println("Curved Surface Area of Cylinder: "+ (6 * r * r ));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from Below : \nCurved Surface Area of Cylinder - 1\nTotal Surface Area of Cube- 2\nEnter : ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                CSAofCylinder();
                break;
            case 2:
                TSAofCube();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
