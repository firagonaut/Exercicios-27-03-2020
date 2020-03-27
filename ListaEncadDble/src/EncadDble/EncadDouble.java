package EncadDble;

public class EncadDouble {

	class DNode {
		DNode prev, next;
		int val;

		DNode(int val) {
			this.val = val;
			prev = next = null;
		}
	}

	/*
	 * Head points to the first element of the list and tail to the last
	 */
	DNode head, tail;

	EncadDouble() {
		this.head = this.tail = null;
	}

	
	/*
	 * Adds an element after certain element. If ele is null, it inserts at the
	 * front
	 */
	public void add(int val, Integer ele) {
		/*
		 * If target node is head
		 */
		if (head == null) {
			head = tail = new DNode(val);
		} else if (head.val == ele || ele == null) {
			DNode temp = new DNode(val);
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
		/*
		 * If target node is tail
		 */
		else if (tail.val == ele) {
			DNode newnode = new DNode(val);
			tail.next = newnode;
			newnode.prev = tail;
			tail = newnode;
		} else {
			DNode newnode = new DNode(val);
			DNode temp = head;
			while (temp.next != null && temp.val != ele) {
				temp = temp.next;
			}
			newnode.next = temp.next;
			newnode.prev = temp;
			temp.next = newnode;
		}
	}

	/*
	 * Removes the specified element
	 */
	public void remove(int ele) {
		/*
		 * If target node is head
		 */
		if (head.val == ele) {
			head = head.next;
			head.prev = null;
		}
		/*
		 * If target node is tail
		 */
		else if (tail.val == ele) {
			tail = tail.prev;
			tail.next = null;
		} else {
			DNode temp = head;
			while (temp.next != null && temp.next.val != ele) {
				temp = temp.next;
			}
			if (temp != null) {
				temp.next = temp.next.next;
				temp.next.prev = temp;
			}
		}
	}

	/*
	 * Checks whether a certain element is true
	 */
	public boolean search(int ele) {
		DNode temp = head;
		while (temp != null) {
			if (temp.val == ele) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	/*
	 * Returns the number of elements in the linked list.
	 */
	public int size() {
		DNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	/*
	 * Prints the elements in the list
	 */
	public void print() {
		DNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}
