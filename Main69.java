class Solution {
    public int minOperations(String s) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) != '0')
                    sum1++;
                else
                    sum2++;

            } else {
                if (s.charAt(i) == '0')
                    sum1++;
                else
                    sum2++;

            }
        }

        return Math.min(sum1, sum2);
    }
}