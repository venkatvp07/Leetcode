package New;

import java.util.*;

public class ValidParentheses {

	public static boolean isValid(String s) {
//        HashMap<Character,Character> charList = new HashMap<Character,Character>();
//        charList.put('(',')');
//        charList.put('[',']');
//        charList.put('{','}');
//        StringBuilder stringBuilder = new StringBuilder();
//		int len = s.length();
//		char lastAdded = ' ';
//		for(int i=0;i<len;i++) {
//			char ch = s.charAt(i);
//			if(charList.get(ch) != null) {
//				stringBuilder.append(String.valueOf(ch));
//				lastAdded = ch;
//			}else if(charList.get(lastAdded) != null && charList.get(lastAdded).equals(ch)){
//				stringBuilder.deleteCharAt(stringBuilder.length()-1);
//				if(stringBuilder.length() == 0) {
//					lastAdded = ' ';
//				}else {
//					lastAdded = stringBuilder.charAt(stringBuilder.length()-1);
//				}
//			}else {
//				return false;
//			}
//		}
//		if(lastAdded == ' ') {
//			return true;
//		}
//		
		
		
		int len = s.length();
		char lastAdded = ' ';
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<len;i++) {
			char ch = s.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.add(ch);
				lastAdded = ch;
			}else if( (lastAdded == '(' && ch == ')') || 
					(lastAdded == '[' && ch == ']') ||
					(lastAdded == '{' && ch == '}') ) {
				stack.pop();
				if(stack.isEmpty()) {
					lastAdded = ' ';
				}else {
					lastAdded = stack.lastElement();
				}
			}else {
				return false;
			}
		}
		if(lastAdded == ' ') {
			return true;
		}
		return false;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("))"));
	}

}
