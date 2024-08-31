package BubbleSort;

public class Main
{
    public static void main(String[] args)
    {
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;

        //printing all values before sorting
        System.out.println("Before Sorting: ");
        for(int num : nums){
            System.out.print(num + " ");
        }

        System.out.println(" ");

        //OUTER LOOP IS RESPONSIBLE FOR NO OF ITERATIONS
        //INNER LOOP IS RESPONSIBLE FOR SWAPPING
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        //printing all values After sorting
        System.out.println("After Sorting: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
