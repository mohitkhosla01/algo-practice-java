package easy;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String[] strings = {
				"()",
				"()[]{}",
				"(]",
				"([)]",
				"{[]}",
				"",
				"(",
				"((((",
				"))",
				"()({{}})",
				"()({{]})",
				"[([]])"
		};
		for(String s : strings) {
			System.out.println(s + "\t" + new ValidParenthesis().isValid(s));
		}
	}
	
	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		for(int i=0; i<s.length(); ++i) {
			char currentChar = s.charAt(i);
			
			if(currentChar == '(' || currentChar == '{' || currentChar == '[') {
				stack.push(currentChar);
			}
			else if(stack.isEmpty()) {
				return false;
			}
			else {
				if(currentChar == ')') {
					if(stack.peek() == '{' || stack.peek() == '[') {
						return false;
					}
					else if(stack.peek() == '(') {
						stack.pop();
					}
				}
				else if(currentChar == '}') {
					if(stack.peek() == '(' || stack.peek() == '[') {
						return false;
					}
					else if(stack.peek() == '{') {
						stack.pop();
					}
				}
				else if(currentChar == ']') {
					if(stack.peek() == '(' || stack.peek() == '{') {
						return false;
					}
					else if(stack.peek() == '[') {
						stack.pop();
					}
				}
			}
		}
		
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
}
