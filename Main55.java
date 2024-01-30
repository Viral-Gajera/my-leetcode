class Solution {
    public boolean isAnagram(String s, String t) {

        StringBuilder sb = new StringBuilder(t);

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            String current = String.valueOf(s.charAt(i));
            int index = sb.indexOf(current);
            if (index != -1) {
                sb.replace(index, index + 1, "#");
            } else {
                return false;
            }
        }
        return true;
    }
}