package com.practice.programs;

public class LinkedListImplementation {
	Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
		
	}
	
	
	public static void main(String args[]) {
		
		LinkedListImplementation llist = new LinkedListImplementation();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next=second;
		second.next=third;

		llist.printLinkedList();
		
	}
	
	public  void printLinkedList() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data+" ");
			n=n.next;
		}
			
	}

}
