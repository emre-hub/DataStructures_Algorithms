package DataStructures_Algorithms.BinarySearchTree_OgrenciKayitUygulamasi;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    Node newNode(int no, String ad, int not){
        root = new Node(no, ad, not);
        return root;
    }

    Node insert(Node root, int no, String ad, int not){
        if(root != null){
            if(no < root.no){
                root.left = insert(root.left, no, ad, not);
            }else{
                root.right = insert(root.right, no, ad, not);
            }
        }else{
            root = newNode(no, ad, not);
        }
        return root;
    }

    void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.no + "\t" + root.ad + "\t" + root.not);
            inOrder(root.right);
        }
    }

    Node delete(Node root, int x){
        Node t1, t2;
        if(root == null){//ağaç yoksa silinecek öğrenci de yoktur, null döndürürüm
            return null;
        }
        if(root.no == x){ //sileceğimiz öğrenciyi bulduk
            if(root.left == root.right){ //sileceğim düğüm yaprak düğümdür, altında eleman yoktur
                root = null; //elemanı silip null olarak döndürürüm
                return root;
            }else if(root.left == null){//sileceğim düğümün solu boşsa
                t1 = root.right; //sileceğim düğümün sağındaki elemanı döndürürüm
                return t1; //yani düğümüm silinir, sağdaki elemandan devam ederim
            }else if(root.right == null){ //aynı işlemi bu durumda da yapabilirim
                t1 = root.left;
                return t1;
            }else{ //sileceğim düğümün hem solu hem de sağı boş değilse
                t1 = t2 = root.right;
                while (t1.left != null){ //sileceğim düğümü silip, yerine sağındaki elemanı koyarım.
                    t1 = t1.left;
                }
                t1.left = root.left; //soldaki düğüm ise, artık kardeşi olan düğümün solunu gösterir.
                return t2;
            }
        }else{//sileceğim öğrenciyi bulamadığımda aramaya devam ederim
            if( x < root.no ){ //x'in değeri kökümdeki değerden küçükse sol taraftan aramaya devam ederim.
                root.left = delete(root.left, x);
            }else{
                root.right = delete(root.right, x);
            }
        }
        return root; //silinecek elemanı hiçbir yerde bulamadıysam burada, fonksiyonumun sonunda kökümü geri döndürürüm. root'u kaybetmemeliyim.
    }

}
