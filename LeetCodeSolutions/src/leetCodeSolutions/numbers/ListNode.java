package leetCodeSolutions.numbers;

public class ListNode {

	int val;
	ListNode next;

	ListNode() {

	}

	ListNode(int val) {
		this.val = val;

	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}

class solution{
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode dummyHead = new ListNode(0); // Create a dummy node
		ListNode current = dummyHead; // Pointer to build the new list

		// Loop until both lists are fully traversed and no carry remains
		while (l1 != null || l2 != null || carry != 0) {
			int val1 = (l1 != null) ? l1.val : 0; // If l1 is not null, take its value; else 0
			int val2 = (l2 != null) ? l2.val : 0; // Similarly for l2

			int sum = val1 + val2 + carry; // add values and carry
			carry = sum / 10;// Update carry for next iteration
			int digit = sum % 10;// Extract the digit to store

			current.next = new ListNode(digit); // Create a new node with the digit
			current = current.next; // Move to the next position

			if (l1 != null)
				l1 = l1.next; // Move l1 pointer forward
			if (l2 != null)
				l2 = l2.next;// Move l2 pointer forward

		}
		return dummyHead.next;// Return the next node of dummyHead (head of result list)
	}

	 public static void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val);
	            if (head.next != null) {
	                System.out.print(" -> ");
	            }
	            head = head.next;
	        }
	        System.out.println();
	    }

	   
	}


