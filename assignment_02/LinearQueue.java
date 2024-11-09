package com.assignment_02;

public class LinearQueue {
	
	private int arr[];
	private int front, rear;
	private final int SIZE ;
	public LinearQueue(int size) {
	
		SIZE = size;
		arr = new int[size];
		front=0;
		rear = 0;
	}
	
	public void push(int v) {
		
		rear++;
		arr[rear] = v;
}
	public int pop() {
		int temp = arr[front+1];
		
		front ++ ;
		return temp;
	}
	
	public int peek()
	{
		return arr[front+1];
	}
	
	public boolean isFull() {
		if(rear == SIZE-1)
		  	return true;
		  	
		 return false;	
	}
	
	public boolean isEmpty() {
		if(rear == front)
			return true;
		return false;
	}
	
	
	
	

}
