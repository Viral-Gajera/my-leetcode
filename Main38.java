class Solution {
    int move(int[] currentPoint, int[] goalPoint) {
        if (Math.abs(currentPoint[0] - goalPoint[0]) > Math.abs(currentPoint[1] - goalPoint[1])) {
            return Math.abs(currentPoint[0] - goalPoint[0]);
        } else {
            return Math.abs(currentPoint[1] - goalPoint[1]);
        }
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for (int i = 1; i < points.length; i++) {
            time += move(points[i - 1], points[i]);
        }
        return time;
    }
}