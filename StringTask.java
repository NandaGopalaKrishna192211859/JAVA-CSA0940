import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        System.out.println("Enter a StateMent : ");
        Scanner sc = new Scanner(System.in);

        String statement = sc.nextLine();
        String reversed = "";

        System.out.println("Lower Case : "+ statement.toLowerCase());
        System.out.println("Upper Case : "+statement.toUpperCase());

        for(int i=0; i<statement.length();i++){
            reversed = statement.charAt(i) + reversed;
        }
        System.out.println("Reversed : " + reversed);

        System.out.println("Enter the Position : ");
        int p = sc.nextInt();

        System.out.println("Letter at given Position : "+statement.charAt(p));
        System.out.println("Length of Statement : "+statement.length());
    }
}
