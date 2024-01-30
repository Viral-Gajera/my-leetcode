import java.util.HashSet;
import java.util.Vector;

public class Main62 {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("apple");
        vector.add("banana");
        vector.add("orange");
        vector.add("banana");
        vector.add("kiwi");

        HashSet<String> hashSet = new HashSet<>();
        for (String element : vector) {
            if (!hashSet.add(element)) {
                System.out.println(element + " is a duplicate");
            }
        }
    }
}