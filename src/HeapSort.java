import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int child = i;
            int parent = (child - 1) / 2;
            while (parent >= 0 && arr[parent] < arr[child]) {
                swap(arr, child, parent);
                child = parent;
                parent = (child - 1) / 2;
            }
        }
        for (int i = arr.length - 1; i>=0; i--) {
            swap(arr, i, 0);
            int parent = 0;
            int maxChild = getMaxChild(arr, parent, i );
            while (parent < i && arr[parent] < arr[maxChild]) {
                swap(arr, maxChild, parent);
                parent = maxChild;
                maxChild = getMaxChild(arr, parent, i);
                if(maxChild == 0)
                    break;
            }
        }
    }

    private static int getMaxChild(int[] arr, int parent, int lastSortedIndex) {
        int result = 0;
        int leftChild = (parent * 2) + 1;
        int rightChild = (parent * 2) + 2;
        if(leftChild < lastSortedIndex && rightChild < lastSortedIndex) {
            if(arr[leftChild] >= arr[rightChild]){
                result = leftChild;
            }
            else {
                result = rightChild;
            }
        }
        return result;
    }

    private static void swap(int[] arr, int child, int parent) {
        int temp = arr[parent];
        arr[parent] = arr[child];
        arr[child] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,3,7,4,1,3,5,3,6};
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
