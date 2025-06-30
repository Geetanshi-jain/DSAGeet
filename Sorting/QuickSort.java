public class QuickSort {

    static void QuickSort(int[] arr, int st, int end) {
        if (st >= end)
            return;
        int piv = partition(arr, st, end);
        QuickSort(arr, st, piv);
        QuickSort(arr, piv + 1, end);
    }

    static int partition(int[] arr, int st, int end) {
        int piv = arr[st];
        int ctn = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] < piv)
                ctn++;
        }
        int pividx = st + ctn;
        swap(arr, st, pividx);
        int i = st, j = end;
        while (i < pividx && j > pividx) {
            while (arr[i] < piv)
                i++;
            while (arr[j] >= piv)
                j--;
            if (i < pividx && j > pividx) {
                swap(arr, i, j);
                i++;
                j--;

            }
        }
        return pividx;

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args)

    {
        int arr[] = { 5, 13, 8, 7, 10, 2, 4 };
        QuickSort(arr, 0, arr.length - 1);
        for (int elm : arr) {
            System.out.println(elm);
        }

    }

}
