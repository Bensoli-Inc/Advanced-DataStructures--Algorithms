//I'm having a list of elements and I want to search an element out of it.

public class Demo {
    public static void main (String[] args)
    {
        int nums[] = {5,7,9,11,13}; //array of integers (sorted Array)

        //SEARCHING A VALUE -linear search
        int target = 11; //target
        int result = linearSearch(nums, target); //getting the index no

        if(result != -1)
            System.out.println("Element found at index : " + result);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
                return i;
        }

        return -1;
    }
}
