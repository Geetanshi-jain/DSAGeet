public class insertionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 5 };
        int n = arr.length;
        int ctn = 0;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                System.out.print("ctn = " + ctn);
                j--;
            }

        }

        for (int elm : arr) {
            System.out.println(elm);
        }
    }

}
