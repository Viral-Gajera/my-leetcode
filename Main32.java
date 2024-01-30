import java.util.*;

class Solution {

    public String convert(int num) {

        if (num == 0) {
            return "Z";
        }

        char letter = (char) ('A' + num - 1);
        return String.valueOf(letter);
    }

    public String convertToTitle(int columnNumber) {
        Vector<String> list = new Vector<String>();

        System.out.println(columnNumber);

        while (columnNumber != 0) {
            int remainder = columnNumber % 26;

            if (remainder == 0) {
                if (columnNumber < 26) {
                    list.add(convert(columnNumber));
                    break;
                } else {
                    list.add(convert(remainder));
                }

            } else {
                list.add(convert(remainder));
            }

            columnNumber = columnNumber / 26;

        }

        System.out.println(list);

        return "";
    }
}

public class Main32 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convertToTitle(52));
    }
}