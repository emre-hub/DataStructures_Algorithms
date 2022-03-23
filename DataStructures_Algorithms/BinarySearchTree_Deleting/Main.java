package DataStructures_Algorithms.BinarySearchTree_Deleting;

public class Main {
    public static void main(String[] args) {
        Tree bst = new Tree();

        bst.root = bst.insert(bst.root, 10);
        bst.root = bst.insert(bst.root, 5);
        bst.root = bst.insert(bst.root, 15);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 4);
        bst.root = bst.insert(bst.root, 8);
        bst.root = bst.insert(bst.root, 12);

        System.out.println("Tree : ");
        bst.inOrder(bst.root);

        System.out.println("\n\nKök düğümdeki değer  : "  + bst.root.data);

        bst.root = bst.delete(bst.root, 4);

        System.out.println("\n4 silindikten sonra tree  : ");
        bst.inOrder(bst.root);

        bst.root = bst.delete(bst.root, 10);

        System.out.println("\n\n10 silindikten sonra tree : ");
        bst.inOrder(bst.root);

        System.out.println("\n\nKök düğümdeki değer  : "  + bst.root.data);

    }
}
