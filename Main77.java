class Solution {

    public boolean isSpecial(String s) {
        char ch = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                return false;
            }
        }

        return true;
    }

    public boolean isThric(String s, String sub) {
        int index = s.indexOf(sub);
        int appearience = 0;

        while (index != -1) {
            appearience++;

            if (appearience >= 3) {
                return true;
            }

            index = s.indexOf(sub, index + 1);
        }

        return false;
    }

    public int maximumLength(String s) {

        int longest = -1;

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {

                if (j - i <= longest) {
                    continue;
                }

                String sub = s.substring(i, j);

                if (isSpecial(sub)) {

                    System.out.println("SPECIAL " + sub);

                    if (isThric(s, sub)) {
                        if (j - i > longest) {
                            longest = j - i;
                        }
                    }

                } else {
                    break;
                }
            }
        }
        return longest;
    }
}

public class Main77 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maximumLength(
                "aaaa"));
    }
}