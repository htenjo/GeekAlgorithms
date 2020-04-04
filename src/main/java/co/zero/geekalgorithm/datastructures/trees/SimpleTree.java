package co.zero.geekalgorithm.datastructures.trees;

import lombok.Getter;

public class SimpleTree<T> {
    private static final String EMPTY = "";
    private static final String SPACE = " ";
    private TreeNode<T> root;
    
    public SimpleTree(T value) {
        root = new TreeNode<>(value);
    }
    
    public TreeNode<T> addRight(T value) {
        return root.addChild(value, false);
    }
    
    public TreeNode<T> addLeft(T value) {
        return root.addChild(value, true);
    }
    
    public static <T> TreeNode<T> addRight(TreeNode<T> node, T value) {
        return node.addChild(value, false);
    }
    
    public static <T> TreeNode<T> addLeft(TreeNode<T> node, T value) {
        return node.addChild(value, true);
    }
    
    @Getter
    private static class TreeNode<T> {
        private TreeNode<T> left;
        private TreeNode<T> right;
        private TreeNode parent;
        @Getter
        private T value;
        
        public TreeNode(T value) {
            this.value = value;
        }
        
        public TreeNode(T value, TreeNode<T> parent) {
            this.value = value;
            this.parent = parent;
        }
        
        public TreeNode<T> addChild(T value, boolean leftChild) {
            TreeNode<T> node = new TreeNode<>(value);
            
            if (leftChild) {
                this.left = node;
            } else {
                this.right = node;
            }
            
            return node;
        }
    }
    
    public String traversePreOrder() {
        return traversePreOrder(root);
    }
    
    private static String traversePreOrder(TreeNode root) {
        if (root != null) {
            return root.getValue().toString()
                    + SPACE
                    + traversePreOrder(root.left)
                    + traversePreOrder(root.right);
        } else {
            return EMPTY;
        }
    }
    
    public String traversePostOrder() {
        return traversePostOrder(root);
    }
    
    private static String traversePostOrder(TreeNode root) {
        if (root != null) {
            return traversePostOrder(root.left)
                    + traversePostOrder(root.right)
                    + root.getValue().toString()
                    + SPACE;
        } else {
            return EMPTY;
        }
    }
    
    public String traverseInOrder() {
        return traverseInOrder(root);
    }
    
    private static String traverseInOrder(TreeNode root) {
        if (root != null) {
            return traversePostOrder(root.left)
                    + root.getValue().toString()
                    + SPACE
                    + traversePostOrder(root.right);
        } else {
            return EMPTY;
        }
    }
    
    public int getHeight() {
        return getHeight(root);
    }
    
    private static int getHeight(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        } else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    
    public static void main(String[] args) {
        SimpleTree<Integer> tree = new SimpleTree<>(1);
        TreeNode<Integer> two = addRight(tree.root, 2);
        TreeNode<Integer> five = addRight(two, 5);
        TreeNode<Integer> three = addLeft(five, 3);
        TreeNode<Integer> four = addRight(three, 4);
        TreeNode<Integer> six = addRight(five, 6);
        System.out.println("tree.preOrder() = " + tree.traversePreOrder());
        System.out.println("tree.inOrder() = " + tree.traverseInOrder());
        System.out.println("tree.postOrder() = " + tree.traversePostOrder());
        System.out.println("tree.height() = " + tree.getHeight());
    }
}