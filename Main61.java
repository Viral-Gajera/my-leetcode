class Solution {
    public int maxScore(String s) {
        int maxScore = 0;

        int totalOnes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                totalOnes++;
            }
        }

        int zero = 0;
        int one = 0;

        if (s.charAt(0) == '0') {
            zero++;
        } else {
            one++;
        }

        for (int i = 1; i < s.length(); i++) {
            if (zero + (totalOnes - one) > maxScore) {
                maxScore = zero + (totalOnes - one);
                System.out.println(maxScore);
            }

            if (s.charAt(i) == '0') {
                zero++;
            } else {
                one++;
            }
        }
        return maxScore;
    }
}