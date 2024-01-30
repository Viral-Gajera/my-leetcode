class Solution {

    public boolean checkOdd(String s) {
        if ((int) s.charAt(s.length() - 1) % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public String largestOddNumber(String num) {
        for (int i = num.length(); i >= 1; i--) {
            if (checkOdd(num.substring(0, i))) {
                return num.substring(0, i);
            }
        }
        return "";
    }
}