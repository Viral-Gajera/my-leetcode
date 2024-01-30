import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (map1.containsKey(pattern.charAt(i))) {
                if (!map1.get(pattern.charAt(i)).equals(arr[i])) {
                    return false;
                }
            } else if (map2.containsKey(arr[i])) {
                if (map2.get(arr[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                map1.put(pattern.charAt(i), arr[i]);
                map2.put(arr[i], pattern.charAt(i));
            }
        }
        return true;
    }
}