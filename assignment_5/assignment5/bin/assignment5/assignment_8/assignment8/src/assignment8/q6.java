package assignment8;

class TreeNode1 {
    int data;
    TreeNode1 left, right;

    public TreeNode1(int data) {
        this.data = data;
        left = right = null;
    }
}

public class q6 {
    TreeNode1 root;

    public boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(TreeNode1 node, int min, int max) {
        if (node == null)
            return true;

        if (node.data < min || node.data > max)
            return false;

        return isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max);
    }

    public static void main(String[] args) {
        q6 tree = new q6();
        tree.root = new TreeNode1(4);
        tree.root.left = new TreeNode1(2);
        tree.root.right = new TreeNode1(5);
        tree.root.left.left = new TreeNode1(1);
        tree.root.left.right = new TreeNode1(3);

        if (tree.isBST())
            System.out.println("Given binary tree is a binary search tree.");
        else
            System.out.println("Given binary tree is not a binary search tree.");
    }
}