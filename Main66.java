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

        Vector<Long> HFenceDifference = new Vector<Long>();
        Vector<Long> VFenceDifference = new Vector<Long>();

        for (int i = 0; i < HFence.length - 1; i++) {
            for (int j = i + 1; j < HFence.length; j++) {
                HFenceDifference.add((long) Math.abs(HFence[i] - HFence[j]));
            }
        }

        for (int i = 0; i < VFence.length - 1; i++) {
            for (int j = i + 1; j < VFence.length; j++) {
                VFenceDifference.add((long) Math.abs(VFence[i] - VFence[j]));
            }
        }

        Collections.sort(HFenceDifference, Collections.reverseOrder());
        Collections.sort(VFenceDifference, Collections.reverseOrder());

        int i = 0;
        int j = 0;

        while (i < HFenceDifference.size() && j < VFenceDifference.size()) {
            if (HFenceDifference.get(i) > VFenceDifference.get(j)) {
                i++;
            } else if (HFenceDifference.get(i) < VFenceDifference.get(j)) {
                j++;
            } else {
                System.out.println((HFenceDifference.get(i) * VFenceDifference.get(j)));
                return (int) ((HFenceDifference.get(i) * VFenceDifference.get(j)) % (1000000007));
            }
        }
        return -1;
    }
}