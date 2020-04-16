package co.zero.geekalgorithm.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BSTLevelTraversal {
    public static void levelTraversal(BasicBstNode<Integer> root) {
        Queue<BasicBstNode<Integer>> levelNodes = new LinkedList<>();
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
            
            System.out.print(currentNode.getData() + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        BasicBstNode<Integer> root = null;
        
        while (t-- > 0) {
            int data = scan.nextInt();
            root = BSTUtils.insert(root, data);
        }
        
        scan.close();
        levelTraversal(root);
    }
}