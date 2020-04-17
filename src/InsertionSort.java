public class InsertionSort {
    static void insertionSort(int[] arr) {
        int a;
        for(int i=1;i<arr.length;i++) {
            a=i;
            while(a>0 && arr[a-1]>arr[a]) {
                int t=arr[a];
                arr[a]=arr[a-1];
                arr[a-1]=t;
                a=a-1;
            }
        }
    }

    /*
    public static void main(String[] args) {
        int[] ar={5,1,4,6,3,5};
        insertionSort(ar);
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
    }
     */

}
