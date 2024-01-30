import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> line1 = new HashSet<>();
        HashSet<Character> line2 = new HashSet<>();
        HashSet<Character> line3 = new HashSet<>();

        String line1Chars = "qwertyuiop";
        String line2Chars = "asdfghjkl";
        String line3Chars = "zxcvbnm";

        for (int i = 0; i < line1Chars.length(); i++) {
            line1.add(line1Chars.charAt(i));
        }
        for (int i = 0; i < line2Chars.length(); i++) {
            line2.add(line2Chars.charAt(i));
        }
        for (int i = 0; i < line3Chars.length(); i++) {
            line3.add(line3Chars.charAt(i));
        }

        Vector<String> list = new Vector<>();

        for (int i = 0; i < words.length; i++) {

            boolean flag1 = true;
            boolean flag2 = true;
            boolean flag3 = true;

            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].toLowerCase().charAt(j);

                System.out.println(c);

                if (!line1.contains(c)) {
                    flag1 = false;
                }
                if (!line2.contains(c)) {
                    flag2 = false;
                }
                if (!line3.contains(c)) {
                    flag3 = false;
                }

            }

            if (flag1 || flag2 || flag3) {
                list.add(words[i]);
            }
        }

        String[] stringList = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            stringList[i] = list.get(i);
        }

        return stringList;

    }
}