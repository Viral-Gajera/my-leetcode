class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        // Bubble sort
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = 0; j < points.length - 1 - i; j++) {
                if (points[j][0] > points[j + 1][0]) {
                    int[] temporary = points[j];
                    points[j] = points[j + 1];
                    points[j + 1] = temporary;
                }
            }
        }

        int distance = points[1][0] - points[0][0];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] - points[i - 1][0] > distance) {
                distance = points[i][0] - points[i - 1][0];
            }
        }
        return distance;
    }
}