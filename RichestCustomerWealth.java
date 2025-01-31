import java.util.Arrays;
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {3,4,5}
        };
        System.out.println("Max : "+maximumWealthOP(accounts));
        
    }
    public static int maximumWealthOP(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
