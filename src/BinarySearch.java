/**
 * @author 陶波利
 */
public class BinarySearch {
    static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 12, 45, 213, 4123, 5123};
        int x = 5123;
        System.out.println(binarySearch(arr, x));
    }
}
