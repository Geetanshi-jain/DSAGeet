public class mergerSort {
    public static void display(int[] arr1) {
        for (int val : arr1) {
            System.out.println(val);
        }

    }

    static void merge(int[] arr, int l, int mid, int r) {
        int m= mid - l + 1;
        int n = r - mid;
        int[] left = new int[m];
        int[] right = new int[n];
        int i, j, k = 0;
        for (i = 0; i < m; i++) {
            left[i] = arr[l + i];
        }
        for (j = 0; j < n; j++) {
            right[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;
        while (i < m && j < n) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < m) {
            arr[k++] = left[i++];

        }
        while (j < n) {
            arr[k++] = right[j++];
        }

    }

    static void mergeSort(int[] arr, int l, int r) {
        while (l >= r)
            return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 2, 1 };
        System.out.println("array before sorting");
        display(arr);
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        System.out.println("array After sorting");
        display(arr);
    }

}
