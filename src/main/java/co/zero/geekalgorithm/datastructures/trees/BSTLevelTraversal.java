package co.zero.geekalgorithm.datastructures.trees;

import java.util.*;
import java.io.*;

public class BSTLevelTraversal {
    static class Node {
        Node left;
        Node right;
        int data;
        
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    
    public static void levelOrder(Node root) {
        Queue<Node> levelNodes = new LinkedList<>();
        levelNodes.add(root);
        Node currentNode;
        
        while (!levelNodes.isEmpty()) {
            currentNode = levelNodes.poll();
            
            if (currentNode.left != null) {
                levelNodes.add(currentNode.left);
            }
            
            if (currentNode.right != null) {
                levelNodes.add(currentNode.right);
            }
            
            System.out.print(currentNode.data + " ");
        }
    }
    
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        
        scan.close();
        levelOrder(root);
    }
}