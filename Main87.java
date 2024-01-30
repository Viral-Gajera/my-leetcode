class Solution {
    public int missingNumber(int[] nums) {
        int max = 0;
        int sum = 0;
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] == 0) {
                flag = true;
            }

            sum += nums[i];
        }

        int natural = max * (max + 1) / 2;

        if (natural == sum) {

            if (!flag) {
                return 0;
            }

            return max + 1;
        }

        return natural - sum;

    }
}