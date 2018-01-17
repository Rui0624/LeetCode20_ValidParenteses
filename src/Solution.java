import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		if(s.isEmpty())
			return true;
		Stack<Character> parentheses = new Stack<Character>();
		for(int i = 0; i< s.length(); i++){
    	   char c = s.charAt(i);
    	   if(c == '(' || c == '[' || c == '{')
    		   parentheses.push(c);
    	   else{
    		   if(parentheses.isEmpty())
    			   return false;
    		   if(c == ')' && parentheses.peek() != '(')
    			   return false;
    		   if(c == ']' && parentheses.peek() != '[')
    			   return false;
    		   if(c == '}' && parentheses.peek() != '{')
    			   return false;
    		   
    		   parentheses.pop();
    	   }
		}
		
		return parentheses.isEmpty();
    }
}
