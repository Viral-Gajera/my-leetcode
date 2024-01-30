class Solution {

    public boolean checkUnique(int[][] mat, int i, int j) {
        for (int k = 0; k < mat[i].length; k++) {
            if (k == j) {
                continue;
            }
            if (mat[i][k] == 1) {
                return false;
            }
        }
        for (int k = 0; k < mat.length; k++) {
            if (k == i) {
                continue;
            }
            if (mat[k][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0)
                    continue;

                if (checkUnique(mat, i, j)) {
                    count++;
                }
                break;
            }
        }
        return count;
    }
}