package com.sunbeam.list;

public class Question_02 {

	public static void main(String[] args) {
		
		Deque d = new Deque();
		d.pushFront('F');
		d.pushFront('R');
		d.pushFront('O');
		d.pushFront('N');
		d.pushFront('T');
		
		int size = d.size();
		
		for(int i=0; i<size; i++) {
			System.out.print((char)d.peekRear());
			d.popRear();
		}
		System.out.println();
		
		Stack s = new Stack();
		s.push('B');
		s.push('A');
		s.push('C');
		s.push('K');
		System.out.println(s.size());
		int x = s.size();
		for(int i=0; i<x; i++) {
			System.out.print((char)s.peek());
			System.out.println(s.size());
			s.pop();
		}
	}

}
