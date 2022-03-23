package DataStructures_Algorithms.BinarySearchTree;

public class BinarySearchTree {
    Node root;
    public BinarySearchTree(){
        root = null;
    }

    Node newNode(int data){
        root = new Node(data);
        return root;
    }

    Node insert(Node root, int data){
        if(root != null){
            if(data < root.data){
                root.left = insert(root.left, data);
            }else{
                root.right = insert(root.right, data);
            }
        }else{
            root = newNode(data);
        }
        return root;
    }

    void preOrder(Node root){ //önce kök
        if(root != null){
            System.out.print(root.data +  " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root){ //ortada kök
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data +  " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root){ //sonda kök
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +  " ");
        }
    }

    int height(Node root){
        if(root == null){
            return -1;
        }else{
            int left = 0, right = 0;
            left = height(root.left);
            right = height(root.right);

            if(left > right)
                return left+1;
            else
                return right+1;
        }
    }

    int size(Node root){
        if(root == null)
            return 0;
        else{
            return size(root.left) + 1 + size(root.right);
        }
    }
}
