package test;

public class SinglyLinkedList {
	
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
	
	@SuppressWarnings("unused")
	private static void PrintItemsInLinkedList(SinglyLinkedList sll){
		// Printing elements of a Singly Linked List
		ListNode current = sll.head;
		
		while(current != null) {
			System.out.print(current.data + " ---> ");
			current = current.next;
		}	
		System.out.print("null");
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
		
		PrintItemsInLinkedList(sll);
	}

}
