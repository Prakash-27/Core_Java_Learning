package core.java.InternalWorkFlow_of_CollectionFramework;

public class Stack_Implementation_in_LinkedList {

	Node head;

	class Node {
		int value;
		Node next;
	}

	Stack_Implementation_in_LinkedList() {
		head = null;
	}

	// push: add value to the beginning of the list
	public void push(int value) {
		Node extraHead = head;
		head = new Node();
		head.value = value;
		head.next = extraHead;
	}

	public int pop() {
		if (head == null) {
			System.out.println("Stack is empty");
		}
		int value = head.value;
		head = head.next;
		return value;
	}

	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Stack_Implementation_in_LinkedList stack_ImpLinkedList = new Stack_Implementation_in_LinkedList();

		// stack_ImpLinkedList.pop();
		System.out.println("-------------------------");
		stack_ImpLinkedList.push(10);
		stack_ImpLinkedList.push(20);
		stack_ImpLinkedList.push(30);
		stack_ImpLinkedList.push(40);
		stack_ImpLinkedList.push(60);
		stack_ImpLinkedList.push(90);
		System.out.println("-------------------------");
		System.out.println("element removed or popped from stack: " + stack_ImpLinkedList.pop());
		System.out.println("element removed or popped from stack: " + stack_ImpLinkedList.pop());
		System.out.println("-------------------------");
		stack_ImpLinkedList.push(45);
		System.out.println("-------------------------");
		System.out.println("element removed or popped from stack: " + stack_ImpLinkedList.pop());

		printList(stack_ImpLinkedList.head);

	}

}
