/***
 * created by huang ON 2020/7/6
 */

public class findRepeatNumber {
    public static int findRepeatNumber(int[] nums) {
        int[] counts = new int[nums.length-1];
        for (int i = 0; i < nums.length; i++){
            counts[nums[i]]+=1;
            if (counts[nums[i]]>1){
                System.out.print(nums[i]);
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        findRepeatNumber(nums);

    }
}
