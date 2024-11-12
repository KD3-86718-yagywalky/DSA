package com.sunbeam.list;

public class Question_01 {

	public static void main(String[] args) {
		
		SinglyCircularLinkedList s = new SinglyCircularLinkedList();
		
		s.addFirst(15);
		s.addFirst(16);
		s.addFirst(17);
		s.addFirst(18);
		s.display();
		s.addLast(20);
		s.addLast(21);
		s.addLast(22);
		s.display();
//		s.addPosition(28, 5);
		s.deleteFirst();
		s.display();
		s.deleteLast();
		s.display();
		s.deletePosition(2);
		s.display();
	}

}
