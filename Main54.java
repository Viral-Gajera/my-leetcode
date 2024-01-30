import java.util.*;

class Solution {

    

    public String destCity(List<List<String>> paths) {
        Vector<String> destinations = new Vector<String>();

        for (int i = 0; i < paths.size(); i++) {
            destinations.add(paths.get(i).get(1));
        }

        for (int i = 0; i < paths.size(); i++) {
            String current = paths.get(i).get(0);
            if (destinations.indexOf(current) != -1) {
                destinations.remove(current);
            }
        }
        return destinations.get(0);
    }
}