public class Main6 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.mySqrt(9));
    }
}

class Solution {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        for (int i = 0; i <= x;) {
            int comparision = x - i * i;
            if (comparision <= 0) {
                if (comparision != 0) {
                    return i - 1;
                } else {
                    return i;
                }
            }
            i += comparision;
        }
        return -1;
    }
}
