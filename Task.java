import java.util.Scanner;

public class Task {

    public static void IF(){
        int age = 20;
        if(age > 18){
            System.out.println("Age > 18");
        }
    }

    public static void IF_ELSE(){
        int number = 13;
        if(number % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }

    public static void NESTEDIFELSE(){
        int x = 30;
        int y = 10;
        if(x==30){
            if (y==10) {
                System.out.println("x = 30 and y = 10");
            }
        }
    }

    public static void IF_ELSE_IF_LADDER(){
        int marks = 65;
        if(marks < 50){
            System.out.println("Fail");
        }
        else if(marks >=50 && marks < 60){
            System.out.println("D grade");
        }
        else if(marks >=60 && marks < 70){
            System.out.println("C grade");
        }
        else if(marks >=70 && marks < 80){
            System.out.println("B grade");
        }
        else if(marks >=80 && marks < 90){
            System.out.println("A grade");
        }
        else if(marks >=90 && marks < 100){
            System.out.println("A+ grade");
        }
        else{
            System.out.println("Invalid");
        }
    }

    public static void SWITCH(){
        int num = 20;
        switch(num){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not 10,20,30");
        }
    }
    public static void main(String[] args) {
        IF();
        System.out.println(".................................");
        IF_ELSE();
        System.out.println(".................................");
        NESTEDIFELSE();
        System.out.println(".................................");
        IF_ELSE_IF_LADDER();
        System.out.println(".................................");
        SWITCH();
    }
}
