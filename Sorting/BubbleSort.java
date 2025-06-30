public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 5, 10, 4, 6, 2 };
        int n = arr.length;
boolean flg=false;

        for (int i = 0; i < n; i++) {
            flg= false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                        flg =true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
            if(flg == false){
                return ;
            }
        }
        for (int elm : arr) {
            System.out.println(elm);
        }

    }

}
