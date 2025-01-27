// Area Of Circle Java Program
// Area Of Triangle
// Area Of Rectangle Program
// Area Of Isosceles Triangle
// Area Of Parallelogram
// Area Of Rhombus
// Area Of Equilateral Triangle

import java.util.Scanner;

public class areas {
    public static void Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        int r = sc.nextInt();
        System.out.println("Area : "+ (Math.PI * r * r));
    }
    
    public static void Triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and Breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area : "+ (0.5 * b * l));
    }
    
    public static void Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and Breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area : "+ (b * l));
    }

    public static void IsoscelesTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and Breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area : "+ (0.5 * b * l));
    }
    
    public static void Parallelogram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and Breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area : "+ (b * l));
    }
    public static void Rhombus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the d1 and d2 : ");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        System.out.println("Area : "+ (0.5 * d1 * d2));
    }
    public static void EquilateralTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and Breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area : "+ ( (Math.sqrt(3) / 4 ) * b * l));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from Below : \nCircle - 1\nTriange - 2\nRectangle - 3\nIsosceles Triangle - 4\nParallelogram - 5\nRhombus - 6\nEquilateral Triangle - 7\nEnter : ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Circle();
                break;
            case 2:
                Triangle();
                break;
            case 3:
                Rectangle();
                break;
            case 4:
                IsoscelesTriangle();
                break;
            case 5:
                Parallelogram();
                break;
            case 6:
                Rhombus();
                break;
            case 7:
                EquilateralTriangle();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

}

