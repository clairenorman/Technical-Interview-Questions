public class twoSum {
    /*
    Given an array of integers, return the indices of the two numbers such that they add up to a specific target.

    You may assume that each input would habe exactly one solution, and you may not use the same element twice.

    Example:
        input = [2,5,11,15]
        output = 9
    */

    public static void main(String[] args) {
        int[] nums = new int[] {2,5,11,15};
        int target = 7;

        System.out.println("nums: " + nums);
        System.out.println("target: " + target);
        int[] output = sum(nums, target);
        System.out.println("sum: " + output);
    }

    public static int[] sum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j ++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
