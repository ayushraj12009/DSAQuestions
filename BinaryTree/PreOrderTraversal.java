package BinaryTree;


public class PreOrderTraversal {
    public static void preorderTraversal(TreeNode root) {
        if (root != null) {
            // Visit the root node
            System.out.print(root.val + " ");

            // Recursively traverse the left subtree
            preorderTraversal(root.left);

            // Recursively traverse the right subtree
            preorderTraversal(root.right);
        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        System.out.println("Preorder Traversal:");
        preorderTraversal(root);
    }
}
