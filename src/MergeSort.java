import java.util.Arrays;

public class MergeSort {

    private static void mergeSort(int[] arr, int low, int high) {

        if(low>=high) {
            return;
        }

        int mid = (low+high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {

        int[] brr = new int[high+1];
        int i = low;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=high) {
            if(arr[i] <= arr[j]) {
                brr[k] = arr[i];
                k++;
                i++;
            }
            else {
                brr[k] = arr[j];
                k++;
                j++;
            }
        }
        if(i>mid) {
            while(j<=high) {
                brr[k] = arr[j];
                k++;
                j++;
            }
        }
        else {
            while(i<=mid) {
                brr[k] = arr[i];
                k++;
                i++;
            }
        }

        k = 0;
        for(int q = low; q <= high; q++) {
            arr[q] = brr[k];
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,4,2,7,3,5,7,3,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
