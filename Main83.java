import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet() ){
            Integer key = e.getKey();
            

        }

    }
}