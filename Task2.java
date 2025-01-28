import java.util.Scanner;

public class Task2 {
    public static void oneDArray(){
        int scores1[] = {50,12,45,78,66,100,125};
        System.out.println(scores1[2]);
    }
    public static void twoDArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data : ");
        int[][] arr = new int[6][6];

        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {  
        //Arrays
        oneDArray();
        System.out.println(".................................");
        twoDArray();
        
   }
}
