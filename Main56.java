import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray(), tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss, tt);
    }
}