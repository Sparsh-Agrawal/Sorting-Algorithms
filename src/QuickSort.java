import java.util.Random;

public class QuickSort {
    static void quickSort(int arr[], int left, int right) {
        int l = left;
        int r = right-1;
        int size = right-left;
        if(size>1) {
            Random rn = new Random();
            int pivot = arr[rn.nextInt(size)+l];
            while (l<r) {
                while (arr[r]>pivot && r>l) {
                    r--;
                }
                while (arr[l]<pivot && l<=r) {
                    l++;
                }
                if(l<r) {
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                }
            }
            quickSort(arr, left, l);
            quickSort(arr, r, right);
        }
    }

//    public static void main(String[] args) {
//        int[] arr = {1,5,7,3,7,3,-1,0,4,-8,45,75,23,87};
//        quickSort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }

}
