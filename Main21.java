class Solution {
    public int singleNumber(int[] nums) {
        int answer = nums[0];
        for (int i = 1; i < nums.length; i++) {
            answer ^= nums[i];
        }
        return answer;
    }
}

public class Main21 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 1, 1, 2, 2, 3, 3, 4, 6, 6 };
        System.out.println(s.singleNumber(nums));
        ;
    }
}