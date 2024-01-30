import java.util.*;;

public class Main81 {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer count = map.get(nums[i]);

            if (count == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], count + 1);
            }
        }

        int N = (int) Math.floor(nums.length / 3);

        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            if (element.getValue() > N)
                System.out.println(element.getKey());
        }

    }
}
