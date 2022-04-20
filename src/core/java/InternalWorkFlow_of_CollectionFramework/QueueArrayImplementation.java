package core.java.InternalWorkFlow_of_CollectionFramework;

public class QueueArrayImplementation {

	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;

	QueueArrayImplementation(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		this.front = 0;
		this.rear = -1;
		this.queueArr = new int[this.capacity];
	}

	/**
	 * this enqueue(Rear) method is used to add the element from the back of the
	 * queue.
	 * 
	 */

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Hey, queue is full, can not insert the data");
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queueArr[rear] = data;
			currentSize++;
			System.out.println(data + " added to the queue");
		}
	}

	/**
	 * this dequeue(Front) method is used to remove the element from the front of
	 * the queue.
	 * 
	 */

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Hey, queue is empty, can not delete element");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println(queueArr[front - 1] + " removed from the queue");
				front = 0;
			} else {
				System.out.println(queueArr[front - 1] + " removed from the queue");
			}
			currentSize--;
		}
	}

	public boolean isFull() {
		if (currentSize == capacity) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (currentSize == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		QueueArrayImplementation obj = new QueueArrayImplementation(5);

		System.out.println(obj.isEmpty());
		System.out.println(obj.isFull());

		obj.enqueue(10);
		obj.enqueue(20);
		obj.dequeue();

		obj.enqueue(40);
		obj.enqueue(330);
		obj.enqueue(350);
		obj.enqueue(254);
		System.out.println("Here queue is full because we assigned 5 in the QueueArrayImplementation Constructor: "
				+ obj.isFull());
		obj.dequeue();

		System.out.println(obj.isEmpty());
		System.out.println(obj.isFull());

	}

}