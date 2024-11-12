package com.sunbeam.list;

public class Deque {
	
	private LinkedList q;
	
	public Deque() {
		q = new LinkedList();
	}
	
		public boolean isEmpty() {
			return q.isEmpty();
		}
		
		public void pushRear(char value){
			q.addFirst(value);
		}
		
		public void pushFront(char value) {
			q.addLast(value);
		}
		public void popRear() {
			q.deleteFirst();
		}
		public int peekRear(){
			return q.getHeadData();
		}
		public int size() {
			return q.size();
		}
}
