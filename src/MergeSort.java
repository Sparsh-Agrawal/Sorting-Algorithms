public class MergeSort {

    private static void mergeSort(int arr, int low, int high) {

        if(low>=high) {
            return;
        }

        int mid = (low+high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1, high);

        merge(arr, low, mid, high);
    }

    private static void merge(int arr, int low, int mid, int high) {

    }
}
