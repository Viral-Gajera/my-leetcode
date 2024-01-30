import java.util.regex.*;
import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {

        if (s.equals("")) {
            return true;
        }

        char[] inputStringArray = s.toLowerCase().toCharArray();
        Vector<String> onlyAlphaNum = new Vector<String>();

        Pattern alphaNumPattern = Pattern.compile("[a-z0-9]");

        for (int i = 0; i < inputStringArray.length; i++) {
            String currentChar = String.valueOf(inputStringArray[i]);

            if (alphaNumPattern.matcher(currentChar).find()) {
                onlyAlphaNum.add(currentChar);
            }
        }

        boolean flag = true;
        int size = onlyAlphaNum.size();
        for (int i = 0; i < size / 2; i++) {
            String start = onlyAlphaNum.get(i).toString();
            String end = onlyAlphaNum.get(size - i - 1).toString();

            if (!start.equals(end)) {
                flag = false;
                break;
            }
        }

        return flag;

    }
}

public class Main18 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(""));
        ;
    }
}