package co.zero.geekalgorithm.datastructures.trees;

/**
 * A tree whose elements have at most 2 children is called a binary tree. Since each element in a binary tree can have
 * only 2 children, we typically name them the left and right child.
 */
public class BinaryTree<T extends Comparable> {
    
    private BasicBstNode<T> root;
    
    public BinaryTree(T value) {
        this.root = new BasicBstNode<>(value);
    }
    
    public String traversePreOrder() {
        return BSTUtils.preOrder(root);
    }
    
    public String traverseInOrder() {
        return BSTUtils.inOrder(root);
    }
    
    public String traversePostOrder() {
        return BSTUtils.postOrder(root);
    }
    
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>(10);
        BSTUtils.insert(tree.root, 1);
        BSTUtils.insert(tree.root, 12);
        BSTUtils.insert(tree.root, 0);
        BSTUtils.insert(tree.root, 5);
        BSTUtils.insert(tree.root, 2);
        
        System.out.println(tree.traversePreOrder());
        System.out.println(tree.traverseInOrder());
        System.out.println(tree.traversePostOrder());
    }
}