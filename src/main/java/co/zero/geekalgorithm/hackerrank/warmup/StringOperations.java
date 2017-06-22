package co.zero.geekalgorithm.hackerrank.warmup;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hernan on 5/31/17.
 */
public class StringOperations {
    /**
     * Method that identify if a given expression has a balanced amount of parenthesis.
     * @param expression The expression to be analyzed.
     * @return True if the expression has balacend parenthesis, false otherwise.
     */
    public static boolean hasBalancedParenthesis(String expression){
        expression = expression.replaceAll("[^\\[\\]{}()]", "");
        char[] chars = expression.toCharArray();
        Map<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put('[', ']');
        parenthesis.put('{','}');
        parenthesis.put('(',')');
        String stack = "";

        for(char c : chars){
            if(parenthesis.keySet().contains(c)){ //Open Parenthesis
                stack += c;
            }else if (parenthesis.values().contains(c)){ //Closed parenthesis
                char lastOpenParenthesis = stack.charAt(stack.length() - 1);

                if(c == parenthesis.get(lastOpenParenthesis)){
                    stack = stack.substring(0, stack.length()-1);
                }else{
                    return false;
                }
            }
        }

        return stack.length() == 0;
    }


    public static void main(String[] args) {
        String expression = "(kjds(hfkj))sdhf[{asdrttttttxxxxx}xxx]";
        expression = expression.replaceAll("[^\\[\\]{}()]", "");
        System.out.println("expression = " + expression);
    }
}
