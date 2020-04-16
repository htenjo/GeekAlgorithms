package co.zero.geekalgorithm.datastructures.trees;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * A tree node with max 2 children to compose a binary tree. Since each element in a binary tree can have
 * only 2 children, we typically name them the left and right child.
 */
@Getter
@Setter
@RequiredArgsConstructor
public class BasicBstNode<T> {
    private BasicBstNode left;
    private BasicBstNode right;
    private final T data;
}
