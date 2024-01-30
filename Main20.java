public class Main20 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 1, 1, 2, 2, 3, 3, 4, 0, 0 };
        System.out.println(s.singleNumber(nums));
    }
}

class Solution {

    public int contains(int[] nums, int key) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                count++;
            }
        }

        return count;
    }

    public int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {

            if (contains(nums, nums[i]) == 1) {
                return nums[i];
            }
        }

        return 1;
    }
}