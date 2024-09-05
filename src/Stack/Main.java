package Stack;

public class Main
{
    public static void main(String[] args)
    {
        Stack nums = new Stack();
        nums.push(15);
        nums.push(8);
        nums.push(22);

        System.out.println(nums.peek());
        nums.push(10);
        System.out.println(nums.pop());
        nums.show();
    }
}

