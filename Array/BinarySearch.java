package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int start = 0;
        int target = 30;
        int mid = 0;
        int end = arr.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            // check if target in present in a middle
            if (arr[mid] == target) {
                System.out.print("mid" + mid);
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

    }

}
