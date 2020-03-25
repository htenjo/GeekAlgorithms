package co.zero.geekalgorithm.datastructures.linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);
        list.add(5);list.add(6);list.add(7);list.add(8);
        list.add(9);list.add(10);list.add(11);list.add(12);
        
        reverseIterative(list);
        System.out.println("list.toString() = " + list.toString());
        reverseRecursive(list, 0, list.size() - 1);
        System.out.println("list.toString() = " + list.toString());
    }
    
    private static void reverseIterative(LinkedList<Integer> list) {
        int min = 0, max = list.size() - 1;
        int lowerValue;
        
        while (min < max ) {
            lowerValue = list.get(min);
            list.set(min, list.get(max));
            list.set(max, lowerValue);
            min++; max--;
        }
    }
    
    private static void reverseRecursive(LinkedList<Integer> list, int min, int max) {
        if (min < max ) {
            int minValue = list.get(min);
            list.set(min, list.get(max));
            list.set(max, minValue);
            reverseRecursive(list, ++min, --max);
        }
    }
}
