package com.practice.programs;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {

	public static void main(String args[]) {

		String expr = "{[()]}";

		Boolean b = areParenthesisBalanced(expr);
		if(b) {
			System.out.println("Parenthesis are Balanced");
		}else
		{
			System.out.println("Parenthesis are not balanced");
		}

	}

	public static Boolean areParenthesisBalanced(String expr) {

		Deque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);
			if (x == '{' || x == '[' || x == '(') {
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;

			char check = stack.pop();

			switch (x) {
			case ('}'):
				if (check == '(' || check == '[')
					return false;
				break;
			case (']'):
				if (check == '{' || check == '(')
					return false;
				break;
			case (')'):
				if (check == '{' || check == '[')
					return false;
				break;
			}
			
		}
		return(stack.isEmpty());

	}

}
