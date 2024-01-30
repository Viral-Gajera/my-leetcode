import java.util.*;

class Solution {
    public void move(int[] coordinate, char direction) {
        switch (direction) {
            case 'N':
                coordinate[1]++;
                break;
            case 'S':
                coordinate[1]--;
                break;
            case 'E':
                coordinate[0]++;
                break;
            case 'W':
                coordinate[0]--;
                break;
            default:
                break;
        }
    }

    public boolean isPathCrossing(String path) {
        int[] coordinate = { 0, 0 };

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("00");

        for (int i = 0; i < path.length(); i++) {
            move(coordinate, path.charAt(i));
            System.out.println(String.format("%d%d", coordinate[0], coordinate[1]));
            if (!hashSet.add(String.format("%d%d", coordinate[0], coordinate[1]))) {
                return true;
            }
        }
        return false;
    }
}