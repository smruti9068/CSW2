package assignment8;

class BSTNode {
    int info;
    BSTNode left;
    BSTNode right;

    public BSTNode(int info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    BSTNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private BSTNode insertRec(BSTNode root, int value) {
        if (root == null) {
            root = new BSTNode(value);
            return root;
        }

        if (value < root.info) {
            root.left = insertRec(root.left, value);
        } else if (value > root.info) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    public void preorderTraversal(BSTNode node) {
        if (node != null) {
            System.out.print(node.info + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void inorderTraversal(BSTNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.info + " ");
            inorderTraversal(node.right);
        }
    }

    public void postorderTraversal(BSTNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.info + " ");
        }
    }
}

public class q1_2 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Preorder traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println("\nInorder traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println("\nPostorder traversal:");
        tree.postorderTraversal(tree.root);
    }
}