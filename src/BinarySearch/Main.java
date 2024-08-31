package BinarySearch;

public class Main {
    public static void main (String[] args)
    {
        int nums[] = {5,7,9,11,13}; //array of integers (sorted Array)

        //SEARCHING A VALUE -binary search
        int target = 7; //target
        int result = binarySearch(nums, target); //getting the index no

        if(result != -1)
            System.out.println("Element found at index : " + result);
        else
            System.out.println("Element not found");
    }

    public static int binarySearch(int[] nums, int target)
    {
        int left = 0; //starting point
        int right = nums.length - 1; //ending point

        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return -1;
    }
}
