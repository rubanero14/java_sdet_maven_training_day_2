package test;
// Components of Singly Linked List
/* 	1. Base Class
 * 	2. Head container instance
 * 	3. Static constructor class with instance name same as Head type
 * 		4. Data container instance
 * 		5. Next container instance
 * 		6. Constructor method with same name as Next type name with parameter for Data instance where parameter assigned to Data
 * 		   container and null value assigned to Next container by default  
 */

public class SinglyLinkedList {
	// container for first linked list
	private ListNode head;
	
	private static class ListNode {
		private int data; // Generic Type
		private ListNode next; 
		// Constructor class for Singly Linked List
		public ListNode(int data) {
			this.data = data; // data that this class will carry in each instance
			this.next = null; // connected variable that will contain another instance of ListNode instance otherwise its null by default
		}
	}
	
	private void PrintItemsInLinkedList(SinglyLinkedList sll){
		// Printing elements of a Singly Linked List
		ListNode current = sll.head;
		
		while(current != null) {
			System.out.print(current.data + " ---> ");
			current = current.next;
		}	
		System.out.print("null");
		System.out.println();
	}
	
	private void LengthOfLinkedList(SinglyLinkedList sll) {
		if(sll == null) {
			System.out.println(0);
			return;
		}
		ListNode current = sll.head;
		int count = 0;
		while(current != null) {
			count++;
			current = current.next;
		}
		System.out.println(count);
		
	}
	
	public void InsertNewNodeInStartOfLinkedList(SinglyLinkedList sll, int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = sll.head;
		head = newNode;
	}
	
	public void InsertNewNodeInEndOfLinkedList(SinglyLinkedList sll, int data) {
		ListNode newNode = new ListNode(data);
		// if nodes inside SLL, assign new node to head node
		if(sll.head == null) {
			sll.head = newNode;
			return;
		}
		ListNode current = sll.head;
		// Traverse till end of Linked List where current.next value comes to null and assign the last not null value to current
		while(current.next != null) {
			current = current.next;
		}
		// As current value currently carries the last node value of the Linked List, current.next value is null in value, hence assign it to the new node value
		current.next = newNode;
	}
	
	public void InsertNewNodeInLinkedListOnIndex(SinglyLinkedList sll, int data, int index) {
		ListNode newNode = new ListNode(data);
		if(sll == null || index == 0) {
			newNode.next = sll.head;
			sll.head = newNode;
			return;
		}

		if(index < 0) {
			sll.InsertNewNodeInEndOfLinkedList(sll, data);
			return;
		}
		
		int idx = 1;
		ListNode current = sll.head;
		while(index != idx && current.next != null) {
			current = current.next;
			idx++;
		}
		newNode.next = current.next;
		current.next = newNode;
	}
	
	public void DeleteFirstNodeInLinkedList(SinglyLinkedList sll) {
		sll.head = sll.head == null ? null : sll.head.next;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		// Now we will connect them together to form a chain
		sll.head.next = second; // 1 ---> 2
		second.next = third; // 1 ---> 2 ---> 3
		third.next = fourth; // 1 ---> 2 ---> 3 ---> 4 ---> null
		
		sll.InsertNewNodeInStartOfLinkedList(sll, 7);
		sll.InsertNewNodeInStartOfLinkedList(sll, 10);
		sll.InsertNewNodeInEndOfLinkedList(sll, 100);
		sll.InsertNewNodeInLinkedListOnIndex(sll, 99, 2);
		sll.InsertNewNodeInLinkedListOnIndex(sll, 98, 2);
		sll.DeleteFirstNodeInLinkedList(sll);
		sll.PrintItemsInLinkedList(sll);
		sll.LengthOfLinkedList(sll);
		sll.LengthOfLinkedList(null);
	}

}
