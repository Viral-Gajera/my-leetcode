class Solution {
    public int numDecodings(String s) {

        if (s.charAt(0) == '0') {
            return 0;
        }

        int total_posibilities = 0;
        int number_of_zero = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                number_of_zero++;
            }
        }

        if (number_of_zero == 0) {
            total_posibilities++;
        }

        return total_posibilities;
    }
}