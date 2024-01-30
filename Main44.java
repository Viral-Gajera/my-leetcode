public class Main44 {

    public static void modify(int[] array) {
        array[0] = 13;
    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3, 4 };
        modify(array);
        System.out.println(array[0]);
    }
}
