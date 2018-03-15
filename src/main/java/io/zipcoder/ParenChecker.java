package io.zipcoder;

import java.util.Stack;

public class ParenChecker {
    //Create a class with a method that verifies all parens () are paired. HINT: Use a stack
    Stack<Character> stack = new Stack<Character>();

    public boolean checkPair(String value){
        for (int i =0; i <value.length();i++){
            // going through loop and making each value a character.
            char c =value.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')'){
                //if the stack is empty return false
                // (which means if both of the statements above are not true then return false)
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();



    }


    public boolean checkForClosing(String value) {
        // Going through the value's length and making each letter a character
        for (int i = 0; i <value.length(); i++){
            char c = value.charAt(i);
            if (c == '(' || c == '{' || c == '[' || c == '<'){
                stack.push(c);
            }else if (c == ')' || c == '}' || c == ']' || c == '>'){
                if (stack.isEmpty()){
                    return false;
                }
                char lastValue = stack.peek();
                if (c == ')' && lastValue == '(' || c == '>' && lastValue == '<' || c == ']' && lastValue == '['||c == '}' && lastValue == '{'){
                    stack.pop();
                }
            }


        }
        return stack.isEmpty();
    }
}
