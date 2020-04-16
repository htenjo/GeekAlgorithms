package co.zero.geekalgorithm.datastructures.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class BSTTopView {
    public static String topViewTraversal(BasicBstNode<Integer> root) {
        String levelTraversal = BSTUtils.levelTraversal(root);
        List<Integer> levelElements =  Arrays.stream(levelTraversal.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Map<Integer, List<Integer>> verticalDistances = BSTUtils.verticalTraversal(root);
        StringBuilder traversal = new StringBuilder();
        
        for (Entry<Integer, List<Integer>> entry : verticalDistances.entrySet()) {
            Integer topElement = getTopElement(entry.getValue(), levelElements);
            traversal.append(topElement + " ");
        }
        
        return traversal.toString();
    }
    
    private static Integer getTopElement(List<Integer> verticalElements, List<Integer> levels) {
        if (verticalElements.size() == 1) {
            return verticalElements.get(0);
        } else {
            List<Integer> levelCopy = new ArrayList(levels);
            levelCopy.retainAll(verticalElements);
            return levelCopy.get(0);
        }
    }
    
    public static void main(String[] args) {
        BasicBstNode<Integer> root = new BasicBstNode<>(1);
        root.setLeft(new BasicBstNode(2));
        root.setRight(new BasicBstNode(3));
        root.getLeft().setRight(new BasicBstNode(4));
        root.getLeft().getRight().setRight(new BasicBstNode(5));
        root.getLeft().getRight().getRight().setRight(new BasicBstNode(6));
        System.out.println(topViewTraversal(root));
    }
}