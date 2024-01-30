class Solution {
    public int findSpecialInteger(int[] arr) {

        if (arr.length == 1) {
            return arr[0];
        }

        final double TWENTYFIVE_PERCENT = arr.length * 0.25;

        for (int i = 0; i < arr.length;) {
            int j = 0;
            while (arr[i + j] == arr[i]) {
                j++;
                if (j > TWENTYFIVE_PERCENT) {
                    return arr[i + j - 1];
                }
            }
            i += j;
        }
        return 0;
    }
}