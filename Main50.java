class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] numOnesRow = new int[grid.length];
        int[] numOnesCol = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    numOnesRow[i]++;
                    numOnesCol[j]++;
                }
            }
        }

        int[][] diff = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                diff[i][j] = numOnesRow[i] + numOnesCol[j] - (grid[i].length - numOnesRow[i])
                        - (grid.length - numOnesCol[j]);
            }
        }

        return diff;
    }
}