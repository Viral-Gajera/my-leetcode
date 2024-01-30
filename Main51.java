class Solution {

    public int arithmaticProgressionSum(int a, int n) {
        return (n) * (2 * a + n - 1) / 2;
    }

    public int totalMoney(int n) {
        int numCompleteWeeks = n / 7;
        int numRemaingDays = n % 7;

        int sum = 0;

        for (int i = 1; i <= numCompleteWeeks; i++) {
            sum += arithmaticProgressionSum(i, 7);
        }

        sum += arithmaticProgressionSum(numCompleteWeeks + 1, numRemaingDays);

        return sum;

    }
}