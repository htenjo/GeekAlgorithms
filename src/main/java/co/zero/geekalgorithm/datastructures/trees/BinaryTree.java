package co.zero.geekalgorithm.datastructures.trees;

/**
 * A tree whose elements have at most 2 children is called a binary tree. Since each element in a binary tree can have
 * only 2 children, we typically name them the left and right child.
 */
public class BinaryTree<T extends Comparable> {
    private static final String EMPTY = "";
    private static final String SPACE = " ";
    private BinaryTreeNode<T> root;
    
    public BinaryTree(T value) {
        this.root = new BinaryTreeNode<>(value);
    }
    
    public void add(T value) {
        root = addRecursive(value, root);
    }
    
    private BinaryTreeNode<T> addRecursive(T value, BinaryTreeNode<T> node) {
        if (node == null) {
            return new BinaryTreeNode<>(value);
        }
        
        if (node.value.compareTo(value) > 0) {
            node.left = addRecursive(value, node.left);
            node.left.parent = node;
        } else if (node.value.compareTo(value) < 0) {
            node.right = addRecursive(value, node.right);
            node.right.parent = node;
        }
    
        return node;
    }
    
    public String traversePreOrder() {
        return preOrderRecursive(root);
    }
    
    public String traverseInOrder() {
        return inOrderRecursive(root);
    }
    
    public String traversePostOrder() {
        return postOrderRecursive(root);
    }
    
    private String preOrderRecursive(BinaryTreeNode<T> node) {
        if (node == null) {
            return EMPTY;
        } else {
            return node.value.toString()
                    + SPACE
                    + preOrderRecursive(node.left)
                    + preOrderRecursive(node.right);
        }
    }
    
    private String inOrderRecursive(BinaryTreeNode<T> node) {
        if (node == null) {
            return EMPTY;
        } else {
            return inOrderRecursive(node.left)
                    + SPACE
                    + node.value
                    + inOrderRecursive(node.right);
        }
    }
    
    private String postOrderRecursive(BinaryTreeNode<T> node) {
        if (node == null) {
            return EMPTY;
        } else {
            return postOrderRecursive(node.left)
                    + postOrderRecursive(node.right)
                    + SPACE
                    + node.value;
        }
    }
    
    /**
     * Node definition for a binary tree
     */
    private static class BinaryTreeNode<T> {
        private BinaryTreeNode<T> left;
        private BinaryTreeNode<T> right;
        private BinaryTreeNode<T> parent;
        private T value;
        
        public BinaryTreeNode(T value) {
            this.value = value;
        }
        
        public BinaryTreeNode(T value, BinaryTreeNode<T> parent) {
            this.parent = parent;
            this.value = value;
        }
    }
    
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>(10);
        tree.add(1);
        tree.add(12);
        tree.add(0);
        tree.add(5);
        tree.add(2);
        System.out.println(tree.traversePreOrder());
    }
}
