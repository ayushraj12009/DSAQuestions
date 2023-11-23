package BinaryTree;


public class InorderTraversal {

    public static void InorderTraversal(TreeNode root){
        if(root != null){
            InorderTraversal(root.left);
            System.out.print(root.val + " ");
            InorderTraversal(root.right );
        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("InOrder Traversak");
        InorderTraversal(root);

    }
}
