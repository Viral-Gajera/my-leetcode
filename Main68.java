class Solution {

    public int minOperationsFormStart(String s) {
        int operation = 0;
        char evenChar = s.charAt(0);
        char oddChar;

        if (evenChar == '0') {
            oddChar = '1';
        } else {
            oddChar = '0';
        }

        for (int i = 1; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) != evenChar) {
                    operation++;
                }
            } else {
                if (s.charAt(i) != oddChar) {
                    operation++;
                }
            }
        }

        return operation;
    }

    public int minOperationsFormEnd(String s) {
        int operation = 0;
        char evenChar;
        char oddChar;

        if (s.length() % 2 == 0) {
            evenChar = s.charAt(s.length() - 2);
        } else {
            evenChar = s.charAt(s.length() - 1);
        }

        if (evenChar == '0') {
            oddChar = '1';
        } else {
            oddChar = '0';
        }

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) != evenChar) {
                    operation++;
                }
            } else {
                if (s.charAt(i) != oddChar) {
                    operation++;
                }
            }
        }
        System.out.println(operation);
        return operation;
    }

    public int minOperations(String s) {

        int start = minOperationsFormStart(s);
        int end = minOperationsFormEnd(s);

        return start > end ? end : start;
    }
}