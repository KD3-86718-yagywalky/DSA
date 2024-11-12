package com.sunbeam.list;

public class Stack {
	
	private LinkedList p;
	
	public Stack() {
		p = new LinkedList();
	}
	
	public void push(char value) {
		p.addFirst(value);
	}
	
	public boolean isEmpty() {
		return p.isEmpty();
	}
	public void pop() {
		p.deleteFirst();
	}
	public int peek() {
		return p.getHeadData();
	}
	public int size() {
		return p.size();
	}
}
