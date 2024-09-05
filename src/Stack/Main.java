package Stack;

public class Main
{
    public static void main(String[] args)
    {
        Stack nums = new Stack();
        nums.push(15);
        nums.push(8);
        nums.push(22);

        System.out.println("finding element " + nums.peek());
        nums.push(10);
        nums.push(3);
        System.out.println("deleting element " + nums.pop());
        System.out.println("size of stack is " + nums.size());
        nums.show();
        System.out.println("empty "+nums.isEmpty());
    }
}

