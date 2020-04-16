package co.zero.geekalgorithm.datastructures.trees;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BSTVerticalTraversal {
    public static void verticalTraversal(BasicBstNode<Integer> root) {
        Map<Integer, String> distance = new TreeMap<>();
        calculateDistances(root, distance, 0);
        printDistances(distance);
    }
    
    private static <T> void calculateDistances(BasicBstNode<Integer> root,
            Map<Integer, String> distances, Integer nodeDistance) {
        if (root == null) {
            return;
        }
        
        if (!distances.containsKey(nodeDistance)) {
            distances.put(nodeDistance, "");
        }
        
        distances.put(nodeDistance, distances.get(nodeDistance) + " " + root.getData());
        
        if (root.getLeft() != null) {
            calculateDistances(root.getLeft(), distances, nodeDistance - 1);
        }
        
        if (root.getRight() != null) {
            calculateDistances(root.getRight(), distances, nodeDistance + 1);
        }
    }
    
    private static void printDistances(Map<Integer, String> distances) {
        for (Entry<Integer, String> entry : distances.entrySet()) {
            System.out.println("Column " + entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        BasicBstNode<Integer> root = new BasicBstNode<>(1);
        root.setLeft(new BasicBstNode<>(2));
        root.setRight(new BasicBstNode<>(3));
        root.getLeft().setLeft(new BasicBstNode<>(4));
        root.getLeft().setRight(new BasicBstNode<>(5));
        root.getRight().setLeft(new BasicBstNode<>(6));
        root.getRight().setRight(new BasicBstNode<>(7));
        root.getRight().getRight().setLeft(new BasicBstNode<>(8));
        root.getRight().getRight().setRight(new BasicBstNode<>(9));
        verticalTraversal(root);
    }
}