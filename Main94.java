import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        boolean containsOdd = false;
        int length = 0;

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            int count = e.getValue();

            if (count % 2 == 0) {
                length += count;
            } else {
                containsOdd = true;
                length += count - 1;
            }

        }

        if (containsOdd) {
            return length + 1;
        } else {
            return length;
        }
    }
}