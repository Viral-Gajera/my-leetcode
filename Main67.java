import java.util.*;

class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        if (m == n) {
            return (int) ((m - 1) * (n - 1) % (Math.pow(10, 9) + 7));
        }

        int[] HFence = Arrays.copyOf(hFences, hFences.length + 2);
        HFence[hFences.length] = m;
        HFence[hFences.length + 1] = 1;

        int[] VFence = Arrays.copyOf(vFences, vFences.length + 2);
        VFence[vFences.length] = n;
        VFence[vFences.length + 1] = 1;

        int area = 0;

        for (int h_lower = 0; h_lower < HFence.length - 1; h_lower++) {

            for (int h_upper = h_lower + 1; h_upper < HFence.length; h_upper++) {

                for (int v_lower = 0; v_lower < VFence.length - 1; v_lower++) {

                    for (int v_upper = v_lower + 1; v_upper < VFence.length; v_upper++) {

                        int x = HFence[h_upper] - HFence[h_lower];
                        int y = VFence[v_upper] - VFence[v_lower];

                        if (x == y) {
                            if (((x * y) % (1000000007)) > area) {
                                area = (Math.abs((x * y)) % (1000000007));
                            }
                        }
                    }
                }
            }
        }
        if (area != 0) {
            return area;
        }
        return -1;
    }
}