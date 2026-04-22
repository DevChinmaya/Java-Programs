import java.util.ArrayDeque;
import java.util.Queue;
public class BinarySearchTree {
    int count=0;
    Node root;
    boolean flag;
    public boolean add(int key){
        flag=true;
        root=add(root,key);
        return flag;
    }
    public Node add(Node n,int key){
        if(n==null){
            n= new Node(key);
            count++;
            return n;
        }
        if(key < n.key){
            n.left=add(n.left,key);
        }else if(key > n.key){
            n.right = add(n.right,key);
        }else{
            flag=false;
        }
        return n;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void preOrder(){
        preOrder(root);
    }
    public void postOrder(){
        postOrder(root);
    }
    public void inOrder(){
        inOrder(root);
    }
    public void preOrder(Node n){
        if(n==null) return;
        System.out.println(n.key);
        preOrder(n.left);
        preOrder(n.right);
    }
    public void postOrder(Node n){
        if(n==null) return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.println(n.key);
    }
    public void inOrder(Node n){
        if(n==null) return;
        inOrder(n.left);
        System.out.println(n.key);
        inOrder(n.right);
    }
    public void levelOrder(){
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node n=q.poll();
            System.out.println(n.key);
            if(n.left!=null)
                q.add(n.left);
            if(n.right!=null)
                q.add(n.right);
        }
    }
    public void remove(int key){
        remove(root,key);
    }
    public Node remove(Node n,int key){
        if(n==null) return null;
        if(key < n.key){
            n.left=remove(n.left,key);
        }else if(key>n.key){
            n.right=remove(n.right, key);
        }else{
            if(n.left==null && n.right==null){
                return null;
            }
            else if(n.left==null){
                return n.right;
            }
            else if(n.right == null){
                return n.left;
            }
            else{
                n.key=minNode(n.right);
                n.right=remove(n.right,n.key);
            }
        }
        return n;
    }
    public int minNode(Node n){
        int key=n.key;
        while(n.left != null){
            key=n.left.key;
            n=n.left;
        }
        return key;
    }

}
