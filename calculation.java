import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        System.out.println("Enter the 2 numbers and an operator : ");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char sym = sc.next().charAt(0);

        if(sym == '+'){
            System.out.println(n1+n2);
        }
        else if(sym == '-'){
            System.out.println(n1-n2);
        }
        else if(sym == '*'){
            System.out.println(n1*n2);
        }
        else if(sym == '/'){
            System.out.println(n1/n2);
        }
        else{
            System.out.println("Error!!");
        }

    }
}
