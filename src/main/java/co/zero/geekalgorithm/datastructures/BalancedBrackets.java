package co.zero.geekalgorithm.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class BalancedBrackets {
    static String isBalanced(String s) {
        Deque<Character> symbolsStack = new ArrayDeque<>();
        Map<Character, Character> parenthesis = new HashMap<Character, Character>() {{
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }};
        
        for (char currentChar : s.toCharArray()) {
            if (symbolsStack.isEmpty() && parenthesis.values().contains(currentChar)) { //Close parenthesis can't be at the beginning
                return "NO";
            }
    
            if (parenthesis.keySet().contains(currentChar)) { //Open bracket added to the stack
                symbolsStack.push(currentChar);
                continue;
            }
    
            if (parenthesis.get(symbolsStack.peekFirst()) == currentChar) { //Remove close bracket from the top
                symbolsStack.pollFirst();
                continue;
            }
            
            if (!symbolsStack.isEmpty() && symbolsStack.peekFirst() != currentChar) {
                return "NO";
            }
        }
        
        return symbolsStack.isEmpty() ? "YES" : "NO";
    }
    
    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}")); //YES
        System.out.println(isBalanced("{[(])}")); //NO
        System.out.println(isBalanced("{{[[(())]]}}")); //YES
        System.out.println("--------------------------");
        System.out.println(isBalanced("{(([])[])[]}")); //YES
        System.out.println(isBalanced("{(([])[])[]]}")); //NO
        System.out.println(isBalanced("{(([])[])[]}[]")); //YES
        System.out.println("--------------------------");
        System.out.println(isBalanced("}][}}(}][))]")); //NO
        System.out.println(isBalanced("[](){()}")); //YES
        System.out.println(isBalanced("()")); //YES
        System.out.println(isBalanced("({}([][]))[]()")); //YES
        System.out.println(isBalanced("{)[](}]}]}))}(())("));//NO
        System.out.println(isBalanced("([[)"));//NO
    }
}
