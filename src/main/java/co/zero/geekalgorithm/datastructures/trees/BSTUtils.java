package co.zero.geekalgorithm.datastructures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BSTUtils {
    private static final String EMPTY = "";
    private static final String SPACE = " ";
    
    public static <T extends Comparable> BasicBstNode<T> insert(BasicBstNode<T> root, T data) {
        if (root == null) {
            return new BasicBstNode(data);
        } else {
            BasicBstNode<Integer> current;
            
            if (root.getData().compareTo(data) > 0) {
                current = insert(root.getLeft(), data);
                root.setLeft(current);
            } else if (root.getData().compareTo(data) < 0){
                current = insert(root.getRight(), data);
                root.setRight(current);
            }
            
            return root;
        }
    }
    
    public static <T> String preOrder(BasicBstNode<T> node) {
        if (node == null) {
            return EMPTY;
        } else {
            return node.getData().toString()
                    + SPACE
                    + preOrder(node.getLeft())
                    + preOrder(node.getRight());
        }
    }
    
    public static <T> String inOrder(BasicBstNode<T> node) {
        if (node == null) {
            return EMPTY;
        } else {
            return inOrder(node.getLeft())
                    + SPACE
                    + node.getData()
                    + inOrder(node.getRight());
        }
    }
    
    public static <T> String postOrder(BasicBstNode<T> node) {
        if (node == null) {
            return EMPTY;
        } else {
            return postOrder(node.getLeft())
                    + postOrder(node.getRight())
                    + SPACE
                    + node.getData();
        }
    }
    
    public static <T> String levelTraversal(BasicBstNode<T> root) {
        Queue<BasicBstNode<T>> levelNodes = new LinkedList<>();
        StringBuilder response = new StringBuilder();
        levelNodes.add(root);
        BasicBstNode currentNode;
        
        while (!levelNodes.isEmpty()) {
            currentNode = levelNodes.poll();
            
            if (currentNode.getLeft() != null) {
                levelNodes.add(currentNode.getLeft());
            }
            
            if (currentNode.getRight() != null) {
                levelNodes.add(currentNode.getRight());
            }
            
            response.append(currentNode.getData() + SPACE);
        }
        
        return response.toString();
    }
    
    public static <T> Map<Integer, List<T>> verticalTraversal(BasicBstNode<T> root) {
        Map<Integer, List<T>> distances = new TreeMap<>();
        calculateDistances(root, distances, 0);
        return distances;
    }
    
    private static <T> void calculateDistances(BasicBstNode<T> root,
            Map<Integer, List<T>> distances, Integer nodeDistance) {
        if (root == null) {
            return;
        }
        
        if (!distances.containsKey(nodeDistance)) {
            distances.put(nodeDistance, new ArrayList<>());
        }
        
        distances.get(nodeDistance).add(root.getData());
        calculateDistances(root.getLeft(), distances, nodeDistance - 1);
        calculateDistances(root.getRight(), distances, nodeDistance + 1);
    }
}