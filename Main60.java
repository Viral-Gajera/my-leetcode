class Solution {
    public int maxScore(String s) {
        int zero_count = 0;
        int one_count = 0;

        int i = 0;
        while (i < s.length() && s.charAt(i) == '0') {
            zero_count++;
            i++;
        }

        if (i == 0) {
            i++;
        } else if (i == s.length()) {
            zero_count--;
        }

        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                one_count++;
            }
            i++;
        }

        return zero_count + one_count;
    }
}