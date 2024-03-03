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
		
		sll.PrintItemsInLinkedList(sll);
		sll.LengthOfLinkedList(sll);
		sll.LengthOfLinkedList(null);
	}

}
