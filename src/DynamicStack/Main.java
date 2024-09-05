package DynamicStack;

public class Main
{
    public static void main(String[] args)
    {
        Dstack nums = new Dstack();
        nums.push(15);
        nums.show();
        nums.push(10);
        nums.show();
        nums.push(22);
        nums.show();
        nums.push(25);
        nums.show();
        nums.push(30);
        nums.show();
        nums.push(55);
        nums.show();

        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();


    }
}
