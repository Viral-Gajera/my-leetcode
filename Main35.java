class Solution {

    public int convert(char c) {
        return ((int) c) - 64;
    }

    public int titleToNumber(String columnTitle) {
        int sum = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            sum += (Math.pow(26, i) * convert(columnTitle.charAt(columnTitle.length() - i - 1)));
        }

        return sum;
    }
}

public class Main35 {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.titleToNumber("");
    }
}