import java.util.*;
public class BinarySearchTree{

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }


    }
   static class BinaryTree{
    static int idx=-1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode =new Node(nodes[idx]);
        newNode.left =buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
    }
   
   public static void preorder(Node root){
    if(root==null){
            return;
    }
    System.out.print(root.data+"");
    preorder(root.left);
    
    preorder(root.right);
   }

   public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data) ;
    inorder(root.right);
  }
 public static void levelOrderTraversal(Node root){
    if(root==null){
        return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node currNode=q.remove();
        if(currNode==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            System.out.print(currNode.data+"  ");
            if(currNode.left!=null){
                q.add(currNode.left);

            }if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
    }
 }
 

public static void postorder(Node root){
    if(root==null){
        return ;
    }
    
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data);
}

}
public static int count(Node root){
    if(root==null){
        return 0;
    }
   int lCount=count(root.left);
   int  rCount=count(root.right);
    return Math.max(lCount,rCount)+1;
}
public static int sumOfNodes(Node root){
    if(root==null){
        return 0;
    }
   int lSum=sumOfNodes(root.left);
   int  rSum=sumOfNodes(root.right);
    return lSum+rSum+root.data;
}
   public static int diameter(Node root){
    if(root==null){
        return 0;
    }
    int ld=diameter(root.left);
     int lh=count(root.left);
    int rd=diameter(root.right);
    int rh =count(root.right);
    int sd =lh+rh+1;
    return Math.max(sd,Math.max(ld,rd));
   }
    public static void main(String[] args) 
    {
        //int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};


       // BinaryTree  t= new BinaryTree();
       //Node root=  t.buildTree(nodes);
      // t.preorder(root);
      // System.out.println("___________");
     //  t.inorder(root);
      // System.out.println(root.data);
      // System.out.println("_____________");
     //  t.postorder(root);
    // t.levelOrderTraversal(root);
    
    Node root= new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);

     int len = count(root);
     System.out.println(len);
     System.out.println(sumOfNodes(root));
     System.out.println(diameter(root));
    }
}