import java.util.*;

class Solution {
    public Character findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (!map.containsKey(c)) {
                return c;
            } else if (map.get(c) == 0) {
                return c;
            } else {
                map.put(c, map.get(c) - 1);
            }

        }

        return s.charAt(0);
    }
}