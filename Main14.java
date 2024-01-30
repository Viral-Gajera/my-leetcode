import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            ArrayList<Integer> returnList = new ArrayList<Integer>();
            returnList.add(1);
            return returnList;
        }

        int pascalArray[][] = new int[50][];
        for (int i = 0; i < rowIndex + 1; i++) {
            pascalArray[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    pascalArray[i][j] = 1;
                } else if (i == j) {
                    pascalArray[i][i] = 1;
                } else {
                    pascalArray[i][j] = pascalArray[i - 1][j] + pascalArray[i - 1][j - 1];
                }
            }
        }

        ArrayList<Integer> returnList = new ArrayList<Integer>();
        for (int i = 0; i < pascalArray[rowIndex].length; i++) {
            returnList.add(pascalArray[rowIndex][i]);
        }

        return returnList;
    }
}