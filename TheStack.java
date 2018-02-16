package dataStructure;

import java.util.Arrays;

public class TheStack {

	private String[] stackArray;
	private int stackSize;
	private int topOfStack = -1;
	TheStack(int size){
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
	}
	public void push(String input) {
		if(topOfStack +1 < stackSize) {
			topOfStack++;
			stackArray[topOfStack] = input;
			
		}else System.out.println("Sorry But stack is full");
		
		System.out.println("PUSH " + input + " was added in stack");
	}
	public String pop() {
		if(topOfStack >= 0 ) {
			System.out.println("POP "+ stackArray[topOfStack]+ " was removed from stack");
			stackArray[topOfStack] = "-1";
			return stackArray[topOfStack--];
		}else {
			System.out.println("Sorry stack is empty");
			return "-1";
		}
	}
	public String peek() {
		System.out.println("PEEK "+ stackArray[topOfStack] + " is at top of stack");
		return stackArray[topOfStack];
	}
	public void popAll() {
		for(int i= topOfStack; i>0; i--) {
			pop();
		}
	}


	public static void main(String[] args) {
		
	}

}
