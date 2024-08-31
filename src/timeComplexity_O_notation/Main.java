package timeComplexity_O_notation;

public class Main {
    public static void main (String[] args)
    {
//        int nums[] = {1,2,3,5,7,9,11,13,15};
//        int target = 11;

        int nums[] = new int[1000];
        int target = 900;

        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);

        if(result1 != -1)
            System.out.println("Element found at index : " + result1);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target)
    {
        int steps = 0;
        for(int i = 0; i < nums.length; i++)
        {
            steps++;
            if(nums[i] == target) {
                System.out.println("Steps taken by linear search : " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear search : " + steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target)
    {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right)
        {
            steps++;
            int mid = (left + right) / 2;
            if(nums[mid] == target)
            {
                System.out.println("Steps taken by binary search : " + steps);
                return mid;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        System.out.println("Steps taken by binary search : " + steps);
        return -1;
    }
}

//linear search takes O(n) time to search an element
//binary serach takes O(log2n) to search an element

