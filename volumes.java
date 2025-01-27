// Volume Of Cone
// Volume Of Prism
// Volume Of Cylinder
// Volume Of Sphere
// Volume Of Pyramid

import java.util.Scanner;

public class volumes {
    public static void Cone(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of base and Height : ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Volume : "+ ((0.33 * Math.PI * r * r * h)));
    }

    public static void Prism(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Area of base and Height : ");
        int a = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Volume : "+ a * h);
    }

    public static void Cylinder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of base and Height : ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Volume : "+ Math.PI * r * r * h);
    }

    public static void Sphere(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        int r = sc.nextInt();
        System.out.println("Volume : "+ (1.33 * Math.PI * r * r * r));
    }
    public static void Pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Area of base and Height : ");
        int a = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Volume : "+ (0.33 * a * h));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from Below : \nCone - 1\nPrism - 2\nCylinder - 3\nSphere - 4\nPyramid - 5Enter : ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Cone();
                break;
            case 2:
                Prism();
                break;
            case 3:
                Cylinder();
                break;
            case 4:
                Sphere();
                break;
            case 5:
                Pyramid();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
