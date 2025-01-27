// Perimeter Of Circle
// Perimeter Of Equilateral Triangle
// Perimeter Of Parallelogram
// Perimeter Of Rectangle
// Perimeter Of Square
// Perimeter Of Rhombus

import java.util.Scanner;

public class perimeters {
    public static void Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        int r = sc.nextInt();
        System.out.println("Perimeter : "+ (2 * Math.PI * r));
    }
    
    public static void Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and Breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Perimeter : "+ (2 * (l + b)));
    }
    
    public static void Parallelogram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and Breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Perimeter : "+ (2 * (l + b)));
    }

    public static void Rhombus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side : ");
        int d1 = sc.nextInt();
        System.out.println("Perimeter : "+ (4 * d1));
    }

    public static void Square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side : ");
        int d1 = sc.nextInt();
        System.out.println("Perimeter : "+ (4 * d1));
    }
    
    public static void EquilateralTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side : ");
        int l = sc.nextInt();
        System.out.println("Perimeter : "+ (3 * l));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from Below : \nCircle - 1\nSquare - 2\nRectangle - 3\nParallelogram - 4\nRhombus - 5\nEquilateral Triangle - 6\nEnter : ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Circle();
                break;
            case 2:
                Square();
                break;
            case 3:
                Rectangle();
                break;
            case 4:
                Parallelogram();
                break;
            case 5:
                Rhombus();
                break;
            case 6:
                EquilateralTriangle();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

}

