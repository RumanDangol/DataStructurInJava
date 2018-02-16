package dataStructure;

import java.util.Arrays;

public class TheQueue {
	
	private String[] queueArray;
	private int queueSize;
	private int front, rear, numberOfItems = 0;
	
	TheQueue(int size){
		queueSize = size;
		queueArray = new String[size];
		Arrays.fill(queueArray, "-1");
	}
	public void insert(String input) {
		if(numberOfItems +1 <= queueSize) {
			queueArray[rear] = input;
			rear++;
			numberOfItems++;
			System.out.println("INSERT "+ input + " was added in queue \n");
		}else {
			System.out.println("Sorry but queue is full \n");
		}
	}
	public void remove() {
		if(numberOfItems > 0 ) {
			System.out.println("REMOVE "+ queueArray[front]+ " was removed in queue");
			queueArray[front] = "-1";
			front++;
			numberOfItems--;
		}else {
			System.out.println("Sorry queue is empty\n");
		}
	}
	public void peek() {
		System.out.println("The First Element if "+ queueArray[front]);
	}
	public static void main(String[] args) {
		TheQueue queue = new TheQueue(50);
		queue.insert("10");
		queue.insert("25");
		queue.insert("5");
		queue.insert("16");
		queue.insert("80");
		
		queue.remove();
		
		queue.peek();
		

	}

}
