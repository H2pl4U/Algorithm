package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//20ÓÐÐ§µÄÀ¨ºÅ
public class String09 {

	public static void main(String[] args) {
		System.out.println(isValid("{[()]}"));
	}
	
	private static Map<Character, Character> map = new HashMap<Character, Character>();
	static {
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
	}
	public static boolean isValid(String str) {
		if (str==null|str.isEmpty()) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (char ch : str.toCharArray()) {
			if(map.containsValue(ch)) {
				stack.push(ch);
			}else if(map.containsKey(ch)) {
				if(stack.empty()||stack.pop()!=map.get(ch)) {
					return false;
				}
			}
		}
		
		return stack.empty();
    }

}
