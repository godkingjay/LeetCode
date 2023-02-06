class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char cur : arr)
        {
            if(cur == '(' || cur == '[' || cur == '{')
            {
                stack.add(cur);
            }
            else
            {
                if(stack.isEmpty()) return false;
                if(stack.peek() == '(' && cur != ')') return false;
                if(stack.peek() == '{' && cur != '}') return false;
                if(stack.peek() == '[' && cur != ']') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
/**

()[}
stack = ['[']

1. closing paranthese must match with the most recent open parentheses
2. we care about the most recent left parantheses
3. what if we have extra closing parantheses
 */