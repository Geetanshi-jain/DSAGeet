package Queue;

public class stackImpUsingQueue {

    public static class queueA {
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[100];

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
            }
            if (f == -1) {
                f = r = 0;
            } else {
                arr[r + 1] = val;
            }
        }

        public int  remove() {
            int temp;
            if (f == -1) {
                System.out.println("empty queue");
                return -1;
            } else {
                temp = arr[f];
                System.out.println("deleted item is ", temp);
                f++;
                size--;

            }
        }

        public boolean isEmpty()
          {
               if(size==0) return true;
               else
               return false;
                  }

        public void display(){
            if(f==-1 &&r==-1){
                System.out.println("queue is Empty");
            }else{
                for(int i=f; i<r; i++){
                    System.out.println("queue is ",arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {

        

    }

}
