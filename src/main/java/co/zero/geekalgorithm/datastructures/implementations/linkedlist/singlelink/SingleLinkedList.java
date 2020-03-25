package co.zero.geekalgorithm.datastructures.implementations.linkedlist.singlelink;

public class SingleLinkedList<T> {
    
    private SingleNode<T> head;
    private int size;
    
    public void add(T element) {
        SingleNode<T> newNode = new SingleNode<>(element);
        SingleNode<T> lastNode = findLast();
        
        if (lastNode == null) {
            head = newNode;
        } else {
            lastNode.setNext(newNode);
        }
        
        size++;
    }
    
    public void delete(int index) {
        SingleNode<T> nodeBefore = index == 0 ? null : findByIndex(index - 1);
        SingleNode<T> nodeToDelete = nodeBefore == null ? head : nodeBefore.getNext();
        
        if (nodeToDelete == head) {
            head = head.getNext();
        } else {
            nodeBefore.setNext(nodeToDelete.getNext());
        }
        
        nodeBefore.setNext(nodeToDelete.getNext());
    }
    
    /**
     * Search a node in the list in the give position
     *
     * @param index Position of a node in the list (zero based)
     * @return Node in the given position.
     */
    public SingleNode<T> findByIndex(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException("Index " + index + " is greater than the list size");
        }
        
        int counter = 0;
        SingleNode<T> currentNode = head;
        
        if (currentNode != null) {
            while (currentNode.getNext() != null && counter < index) {
                currentNode = currentNode.getNext();
                counter++;
            }
        }
        
        return currentNode;
    }
    
    private SingleNode<T> findLast() {
        SingleNode<T> currentNode = head;
        
        if (currentNode != null) {
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
        }
        
        return currentNode;
    }
}
