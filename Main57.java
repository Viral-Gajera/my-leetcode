class Solution {
    public int calc(int[][] img, int i, int j) {

        int count = 0;
        int sum = 0;

        for (int a = -1; a < 2; a++) {
            for (int b = -1; b < 2; b++) {
                if (i + a >= 0 && i + a < img.length) {
                    if (j + b >= 0 && j + b < img[i].length) {
                        sum += img[i + a][j + b];
                        count++;
                    }
                }
            }
        }

        return sum / count;
    }

    public int[][] imageSmoother(int[][] img) {

        int[][] result = new int[img.length][img[0].length];

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                result[i][j] = calc(img, i, j);
            }
        }

        return result;
    }
}