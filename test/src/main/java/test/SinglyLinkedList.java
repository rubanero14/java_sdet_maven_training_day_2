package test;

public class SinglyLinkedList {
	private ListNode head;
	
	private static class ListNode {
		private int data; // Generic type
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
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
	}

}
