import java.util.Arrays;
import java.util.Scanner;

public class ArrayfromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i] = nums[nums[i]];
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
}
