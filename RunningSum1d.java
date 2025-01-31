import java.util.Arrays;

public class RunningSum1d {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSumOptimised(nums)));
        
    }
    public static int[] runningSumOptimised(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
