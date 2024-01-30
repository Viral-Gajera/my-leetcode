class Solution {

    int ways = 0;

    public boolean validate(char first) {
        return first != '0';
    }

    public boolean validate(char first, char second) {
        if (first == '1') {
            return true;
        }
        if (first == '2') {
            if (second <= '6' && second >= '0') {
                return true;
            }
        }

        return false;
    }

    public void decode(String s) {
        if (s.length() == 0) {
            this.ways++;
            return;
        }
        if (validate(s.charAt(0))) {
            decode(s.substring(1));
        }

        if (s.length() == 1) {
            return;
        }
        if (validate(s.charAt(0), s.charAt(1))) {
            decode(s.substring(2));
        }
    }

    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }

        decode(s);
        return this.ways++;
    }
}