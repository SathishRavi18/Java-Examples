import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public TreeNode root;
    public class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    } 
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);   //       9
        TreeNode second = new TreeNode(2);//    2        3
        TreeNode third = new TreeNode(8);//  4
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
        

    }
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
        
    }
    
    public void postorder(TreeNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " " );
        
    }
    

    public void levelorder(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null){
                queue.offer(temp.left);
            }
            if(temp.right != null){
                queue.offer(temp.right);
            }
        }
        

    }
    public int findMax(){
        return findMax(root);
    }

    public int findMax(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left > result){
            result = left;

        }
        if(right > result){
            result = right;
        }
        return result;

    }

    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preorder(bt.root);
        //bt.inorder(bt.root);
        //bt.postorder(bt.root);
        //bt.levelorder(bt.root);
        System.out.println(bt.findMax());


    }
    
}
