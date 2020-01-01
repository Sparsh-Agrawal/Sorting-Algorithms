public class SelectionSort
{
    static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int mi=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[mi])
                    mi=j;
            }
            int t=arr[mi];
            arr[mi]=arr[i];
            arr[i]=t;
        }
    }

    /*
    public static void main(String[] args)
    {
        int[] ar={5,6,7,1,2,3};
        selectionSort(ar);
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
    }
     */

}
