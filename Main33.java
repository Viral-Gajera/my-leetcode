class Solution {

    public String convert(int num) {
        char letter = (char) ('A' + num - 1);
        return String.valueOf(letter);
    }

    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder("");

        while (columnNumber != 0) {

            int remainder = columnNumber % 26;

            if (remainder == 0) {
                sb.append((convert(26)));
                columnNumber = columnNumber / 26;
                columnNumber = columnNumber - 1;

            } else {
                sb.append(convert(remainder));
                columnNumber = columnNumber / 26;
            }
        }

        return sb.reverse().toString();
    }
}

public class Main33 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convertToTitle(703));
    }
}