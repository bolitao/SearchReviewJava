/**
 * @author 陶波利
 */
public class OrderSearch {
    public static boolean orderSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 12, 213, 45, 5123, 4123, 5};
        int key = 5;
        System.out.println(orderSearch(arr, key));
    }
}
