class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];

            for (int j = 0; j < nums2.length; j++) {
                if (num == nums2[j]) {
                    j++;
                    boolean flag = false;
                    while (j < nums2.length) {
                        if (nums2[j] > num) {
                            result[i] = nums2[j];
                            flag = true;
                            break;
                        }
                        j++;
                    }

                    if (!flag) {
                        result[i] = -1;
                    }
                }
            }
        }

        return result;

    }
}