import java.util.*;

class Solution {

    public int sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += (num % 10) * (num % 10);
            num = num / 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        int N = sum(n);

        while (N != 1) {
            if (!set.add(N)) {
                return false;
            }
            N = sum(N);
        }

        return true;
    }
}

public class Main82 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.sum(45));
    }
}