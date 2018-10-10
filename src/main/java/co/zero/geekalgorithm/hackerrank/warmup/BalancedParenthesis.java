package co.zero.geekalgorithm.hackerrank.warmup;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hernan Tenjo on 10/10/18.
 */
class BalancedParenthesis {
    /**
     * Method that identify if a given expression has a balanced amount of parenthesis.
     * @param expression The expression to be analyzed (alphabet = {'(',')', '{', '}', '[', ']'}).
     * @return True if the expression has balancend parenthesis, false otherwise.
     * Complexity: Time O(N), Space AVG O(1), WORST O(N) when all are open parenthesis.
     */
    static boolean hasBalancedParenthesis(String expression) {
        Character currentChar;
        Deque<Character> symbolsStack = new ArrayDeque<>();
        Map<Character, Character> parenthesis = new HashMap<Character, Character>(){{
            put('(', ')');put('{', '}');put('[', ']');
        }};

        for (int i=0; i < expression.length(); i++) {
            currentChar = expression.charAt(i);

            if (parenthesis.keySet().contains(currentChar)) {
                //Open parenthesis added to the stack
                symbolsStack.push(currentChar);
            } else if (parenthesis.values().contains(currentChar) && symbolsStack.isEmpty()) {
                //Close parenthesis can't be at the beginning
                return false;
            } else if (currentChar == parenthesis.get(symbolsStack.peek())) {
                //CurrentChart is the close of the top of the stack.
                symbolsStack.pop();
            }
        }

        return symbolsStack.isEmpty();
    }
}
