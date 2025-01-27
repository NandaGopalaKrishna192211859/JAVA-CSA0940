import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Word : ");
        String word = sc.next();
        String rev = "";
        for(int i = 0; i < word.length(); i++){
            rev = word.charAt(i) + rev;
        }
        System.out.println("Reverse : "+rev);
    }
}
