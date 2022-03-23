package DataStructures_Algorithms.BinarySearchTree_Deleting;

public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    Node newNode(int x){
        root = new Node(x);
        return root;
    }

    Node insert(Node root, int x){
        if(root != null){ //ağacın kökü varsa
            if(x < root.data){
                root.left = insert(root.left, x); //kökten küçükse sola git, solda eleman varsa ve ondan da küçükse onun da soluna git....
            }else{
                root.right = insert(root.right,x); //kökten büyükse sağa git, sağda eleman varsa ve ondan da büyükse onun da sağına git....
            }
        }else{ //ağaçta hiç eleman yoksa kök oluştur.
            root = newNode(x);
        }
        return root;
    }

    void inOrder(Node root){ //ağacı küçükten büyüğe doğru dolaşma
        if(root != null){
            inOrder(root.left); //kökün en soluna kadar git
            System.out.print(root.data + "  "); //ağacın en küçük yaprağından köke kadar elemanları yazdırırım
            inOrder(root.right); //aynı işlemi ağacın sağına doğru giderek yapar
        }
    }

    Node delete(Node root, int x)
    {
        Node t1, t2;
        if(root == null)
            return null;
        if(root.data == x){
            if(root.left == root.right){ //silinecek düğümün altında dal ya da düğüm yoksa :
                root = null;
                return null;
            }else if(root.left == null){ //kök düğümün sadece sağı dolu demektir
                t1 = root.right;
                return t1;
            }else if(root.right == null){ //kök düğümün sadece solu dolu demektir
                t1 = root.left;
                return t1;
            }else{ //sileceğim düğüm kök düğümse
                t1 = t2 = root.right;
                while(t1.left != null){
                    t1 = t1.left;
                }
                t1.left = root.left;
                return t2;
            }
        }else{
            if(x < root.data){
                root.left = delete(root.left, x);
            }else{
                root.right = delete(root.right, x);
            }
        }
        return root;
    }
}
