class Solution {
    public String largestGoodInteger(String num) {
        char c = ' ';
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i - 1) == num.charAt(i - 2)) {
                if (c == ' ') {
                    c = num.charAt(i);
                } else {
                    if (num.charAt(i) > c) {
                        c = num.charAt(i);
                    }
                }
                i += 2;
            }
        }

        if (c == ' ') {
            return "";
        } else {
            return String.format("%c%c%c", c, c, c);
        }
    }
}