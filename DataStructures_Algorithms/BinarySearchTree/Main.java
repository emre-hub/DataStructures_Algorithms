package DataStructures_Algorithms.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 10);
        bst.root = bst.insert(bst.root, 8);
        bst.root = bst.insert(bst.root, 15);
        bst.root = bst.insert(bst.root, 5);
        bst.root = bst.insert(bst.root, 12);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 9);
        bst.root = bst.insert(bst.root, 25);

        System.out.print("preOrder :  ");
        bst.preOrder(bst.root);
        System.out.println();

        System.out.print("inOrder :   ");
        bst.inOrder(bst.root);
        System.out.println();

        System.out.print("postOrder : ");
        bst.postOrder(bst.root);
        System.out.println();

        System.out.println("Ağacın yüksekliği : " + bst.height(bst.root));
        System.out.println("Ağacın eleman sayısı : " + bst.size(bst.root));

        /*
        System.out.println("root : " + bst.root.data);
        System.out.println("root's left : " + bst.root.left.data);
        System.out.println("root's right : " + bst.root.right.data);
        System.out.println("root's right's left : " + bst.root.right.left.data);
        */







        //System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }
    public static String toJadenCase(String phrase) {
        String res;
        String[] str = phrase.split("");
        if(phrase.length() == 0){
            return null;
        }
        res = "";
        for(int i = 0; i < phrase.length(); i++) {
            if (i == 0)
                res += str[0].toUpperCase();
            else
                res += (phrase.charAt(i - 1) == 32) ? str[i].toUpperCase() : str[i];
        }
        res = res.replace("İ","I");
        return res;
    }
}
