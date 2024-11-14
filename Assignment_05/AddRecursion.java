package com.sunbeam.Assignment_05;

public class AddRecursion {

		static class Node{
			private int data ;
			private Node left,right;
			
			public Node(int data) {
				this.data = data;
				
				left = right = null;
			}
					
	}
		private Node root;
		public AddRecursion() {
			root = null;
		}
		
		public boolean isEmpty() {
			return root == null;
		}
		
		public void addNode(int value) {
			
			Node nn = new Node(value);
			
			if(root == null) {
				root = nn;
			}
			else 
				add(value , root);
		}
		
		public void add(int value, Node trav) {
			
			if(value<trav.data)
				if(trav.left == null) {
					trav.left = new Node(value);
					return;
				}
				else 
					add(value,trav.left);
			else
				if(trav.right == null) {
					trav.right = new Node(value);
					return;
				}
				else 
					add(value,trav.right);	
		}
		
		public Node AddRecursionSearch(int key, Node trav) {
			
			
			if (trav == null)
				return null;
			else if(key == trav.data)
				return trav;
			
			else if(key<trav.data)
				return AddRecursionSearch(key,trav.left);
			else 
				return AddRecursionSearch(key, trav.right);
				
		}
		
		public void binarySearch(int key) {
			
			if(AddRecursionSearch(key, root) != null)
				System.out.println("Element is found ");
			else 
				System.out.println("Element is not found ");
		}

}
