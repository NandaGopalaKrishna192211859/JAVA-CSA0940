import java.util.Arrays;

public class ArrayConcat {
    
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2*n];

        //System.arraycopy(source, source_index, destination, destination_index, number_of_elements);
        System.arraycopy(nums,0,result,0,n);
        System.arraycopy(nums,0,result,n,n);

        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
