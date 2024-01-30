class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int second_max = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                continue;
            }
            if (nums[i] >= second_max && second_max <= max) {
                second_max = nums[i];
            }

        }

        return (max - 1) * (second_max - 1);

    }
}