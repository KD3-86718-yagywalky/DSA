package com.sunbeam.list;

public class SinglyCircularLinkedList {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}		
	}
	
	private Node tail;
	private int size;
	public SinglyCircularLinkedList(){
		tail= null;
		size = 0;		
	}
	
	public boolean isEmpty() {
		return tail == null && size ==0;
	}
	
	public void deleteAll() {
		tail = null;
		size =0;
	}
	
	public void addFirst(int value) {
		Node nn = new Node(value);
		
		if(isEmpty()) {
			tail = nn;
		tail.next = nn;
		}
		else {
			nn.next = tail.next;
			tail.next = nn;	
		}
		size++;
	}
	
	public void addLast(int value) {
		Node nn = new Node(value);
		
		if(isEmpty()) {
			tail = nn;
		}
		else {
				nn.next = tail.next;
				tail.next = nn;
		}
		
	}
	
	public void addPosition(int value,int pos) {
		
		Node nn = new Node(value);
		
		if(pos<1 && pos>size+1)
			return;
		
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		else if(pos == size+1) {
			addLast(value);
			return;
		}
		else {
			Node trav = tail.next;
			for(int i =0;i<pos-1;i++){
				trav =trav.next;
				
				nn.next = trav.next;
				trav.next = nn;
			}
		}
		size++;
	}
	
	
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(size == 1) 
			tail = null;
			
		else {
			tail.next = tail.next.next;
		}
		size--;
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(size == 1)
			tail = null;
		else {
				Node trav = tail.next;
				while(trav.next.next != tail.next)
					trav = trav.next;
				trav.next = tail.next;
				tail = trav;
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		if(isEmpty())
			return;
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		else if(pos == size-1) {
			deleteLast();
			return;
		}
		else {
			Node trav = tail.next;
			
			for(int i = 1; i<pos-1;i++)
				trav = trav.next;
			
			trav.next = trav.next.next;
		}
		size--;	
	}
	
	public void display() {
		
		if(isEmpty())
			return;
		
		else {
			Node trav = tail.next;
			do {
				
				System.out.print(" "+trav.data);
				trav = trav.next;
				
			}while(trav != tail.next);
			System.out.println();
		}
	}
	
	
}

















































































