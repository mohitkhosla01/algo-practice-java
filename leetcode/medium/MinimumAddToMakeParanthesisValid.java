package medium;

import java.util.Stack;

public class MinimumAddToMakeParanthesisValid {

	public static void main(String[] args) {
		
		String[] strings = {
				"())",
				"(((",
				"()",
				"()))((",
				"()(()()(",
				"))()()(()",
				"",
				"(())"
		};
		
		for(String s : strings) {
			System.out.println(s + "\t" + new MinimumAddToMakeParanthesisValid().minAddToMakeValid(s));
		}
	}

	public int minAddToMakeValid(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		int c = 0;
		
		for(int i=0; i<s.length(); ++i) {
			char ch = s.charAt(i);
			
			if(ch == '(') {
				stack.push('(');
			}
			else {
				if(stack.isEmpty()) {
					++c;
				}
				else if(stack.peek() == '(') {
					stack.pop();
				}
			}
		}
		
		return c + stack.size();
	}
}
