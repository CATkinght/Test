package test;

import java.util.Stack;

public class satic_test {
	public static void main(String[] args) {
		Stack<Object> stack = new Stack<Object>();
		
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		
		System.out.println(stack);
		
		for (Object object : stack) {
			System.out.println(object);
		}
	}
}

