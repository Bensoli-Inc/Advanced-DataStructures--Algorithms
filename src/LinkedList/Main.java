package LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        Linkedlist list = new Linkedlist();
        list.insert(5);
        list.insert(45);
        list.insert(12);
        list.insertAtStart(25);
        list.insertAt(0, 55);

        list.show();
    }
}

