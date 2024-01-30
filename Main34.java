class Solution {

    public int count(int[] nums, int key) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                count++;
                nums[i] = 0;
            }
        }
        return count;
    }

    public int majorityElement(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        } else if (count(nums, 0) > n / 2) {
            return 0;
        } else {
            for (int i = 0; i < n; i++) {
                int current = nums[i];
                if (current == 0)
                    continue;
                if (count(nums, current) > n / 2) {
                    return current;
                }
            }
            return 0;
        }

    }
}