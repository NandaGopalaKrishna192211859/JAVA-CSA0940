import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        System.out.println("Enter the Name: ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Greetings to "+name+" !!");
    }
}
