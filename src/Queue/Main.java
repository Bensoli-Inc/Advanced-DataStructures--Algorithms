package Queue;

public class Main
{
    public static void main(String[] args)
    {
        Queue Q = new Queue();
        Q.enQueue(5);
        Q.enQueue(2);
        Q.enQueue(3);
        Q.enQueue(7);
        Q.deQueue();
        Q.deQueue();

        Q.show();
    }
}
