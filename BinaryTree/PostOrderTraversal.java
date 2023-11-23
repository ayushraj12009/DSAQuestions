package BinaryTree;

public class PostOrderTraversal {
    public static void preorder(TreeNode root){
        if(root != null){
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("PreOrder Traversal");
        preorder(root);
    }
}
