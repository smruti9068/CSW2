package assignment8;

import java.util.LinkedList;
import java.util.Queue;

class Country {
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
}

class BNode {
    Country info;
    BNode left;
    BNode right;

    public BNode(Country country) {
        this.info = country;
        this.left = null;
        this.right = null;
    }
}

class BST {
    BNode root;

    public BST() {
        this.root = null;
    }

    public void insert(Country country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode root, Country country) {
        if (root == null) {
            root = new BNode(country);
            return root;
        }

        if (country.population < root.info.population) {
            root.left = insertRec(root.left, country);
        } else if (country.population > root.info.population) {
            root.right = insertRec(root.right, country);
        }

        return root;
    }

    public void levelOrderTraversal() {
        if (root == null)
            return;

        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BNode tempNode = queue.poll();
            System.out.print(tempNode.info.name + "(" + tempNode.info.population + ") ");

            if (tempNode.left != null)
                queue.add(tempNode.left);

            if (tempNode.right != null)
                queue.add(tempNode.right);
        }
    }

    public BNode findMax() {
        return findMaxRec(root);
    }

    private BNode findMaxRec(BNode node) {
        if (node == null || node.right == null)
            return node;

        return findMaxRec(node.right);
    }

    public BNode findMin() {
        return findMinRec(root);
    }

    private BNode findMinRec(BNode node) {
        if (node == null || node.left == null)
            return node;

        return findMinRec(node.left);
    }
}

public class q3_4 {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(new Country("USA", 3280000));
        bst.insert(new Country("India", 13800000));
        bst.insert(new Country("China", 14400000));
        bst.insert(new Country("Russia", 1450000));
        bst.insert(new Country("Brazil", 2130000));

        System.out.println("Level Order Traversal:");
        bst.levelOrderTraversal();

        System.out.println("\nCountry with Maximum Population:");
        BNode maxNode = bst.findMax();
        System.out.println(maxNode.info.name + " (" + maxNode.info.population + ")");

        System.out.println("Country with Minimum Population:");
        BNode minNode = bst.findMin();
        System.out.println(minNode.info.name + " (" + minNode.info.population + ")");
    }
}
