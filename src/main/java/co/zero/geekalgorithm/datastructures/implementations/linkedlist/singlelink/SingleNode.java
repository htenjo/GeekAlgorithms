package co.zero.geekalgorithm.datastructures.implementations.linkedlist.singlelink;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleNode<T> {
    
    private SingleNode<T> next;
    private T value;
    
    public SingleNode(T value) {
        this.value = value;
    }
}
