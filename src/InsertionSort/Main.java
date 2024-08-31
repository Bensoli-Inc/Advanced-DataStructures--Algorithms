package InsertionSort;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {3,1,6,2,5,4};

        System.out.println("before sorting");
        for(int num : arr)
            System.out.print(num + " ");

        for(int i=1; i<arr.length;i++)
        {
            int temporaryKey = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > temporaryKey)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temporaryKey;
        }

        System.out.println();
        System.out.println("after sorting");
        for(int num : arr)
            System.out.print(num + " ");
    }
}
