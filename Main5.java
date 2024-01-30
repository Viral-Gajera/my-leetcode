class Solution {

    int convert(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    public int romanToInt(String s) {
        int sum = 0;
        int values[] = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            values[i] = convert(c);
        }

        if (values.length == 1) {
            sum += values[0];
        } else {
            int curentIndex = values.length - 1;
            while (curentIndex > 0) {
                if (values[curentIndex] > values[curentIndex - 1]) {
                    sum += values[curentIndex] - values[curentIndex - 1];
                    curentIndex -= 2;
                } else {
                    sum += values[curentIndex];
                    curentIndex -= 1;
                }
            }
            if (curentIndex > -1) {
                sum += values[curentIndex];
            }
        }

        return sum;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String roman = "MCMXCIV";
        System.out.println(s.romanToInt(roman));
    }
}
