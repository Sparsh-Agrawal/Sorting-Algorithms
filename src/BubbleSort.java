public class BubbleSort {
    void bubbleSort(int[] arr) {
        boolean s=true;
        for(int i=0;i<arr.length-1;i++) {
            s=false;
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    s=true;
                }
            }
            if(s==false) {
                break;
            }
        }
    }

    /*
    public static void main(String[] args) {
        BubbleSort b=new BubbleSort();
        int[] a={4,3,6,2,5,2};
        b.bubbleSort(a);
        for(int i:a) {
            System.out.println(i);
        }
    }
     */

}
