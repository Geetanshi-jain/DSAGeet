
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {

                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
        for (int elm : arr) {
            System.out.println(elm);
        }
    }

}
