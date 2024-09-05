package Tree;

public class Main
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(15);
        tree.insert(40);
        tree.insert(32);
        tree.insert(6);

        tree.inOrder();
        System.out.println();
        tree.preOrder();
    }
}
