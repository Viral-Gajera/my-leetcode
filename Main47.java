class Solution {
    public int maxProduct(int[] nums) {
        int max_index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[max_index]) {
                max_index = i;
            }
        }

        int second_max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > second_max && i != max_index) {
                second_max = nums[i];
            }
        }

        return (nums[max_index] - 1) * (second_max - 1);
    }
}