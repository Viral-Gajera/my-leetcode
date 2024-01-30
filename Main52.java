class Solution {
    public int countCharacters(String[] words, String chars) {

        int sum = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > chars.length()) {
                continue;
            }

            StringBuilder tempChar = new StringBuilder(chars);

            int j;
            boolean flag = true;
            for (j = 0; j < words[i].length();) {

                int isInclude = tempChar.indexOf(String.valueOf(words[i].charAt(j)));

                if (isInclude != -1) {
                    tempChar.setCharAt(isInclude, '0');
                    j++;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sum += j;
            }

        }

        return sum;
    }
}