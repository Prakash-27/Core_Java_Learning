package core.java.InternalWorkFlow_of_CollectionFramework;

public class Stack_Implementation_in_Array {

	int size;
	int arr[];
	int top;

	Stack_Implementation_in_Array(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("pushed element : " + element);
		} else {
			System.out.println("Stack is full now");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("poped element : " + arr[returnedTop]);
			return arr[returnedTop];
		} else {
			System.out.println("stack is empty");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			System.out.println("peeked element is : " + arr[top]);
			return arr[top];
		} else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public static void main(String[] args) {

		Stack_Implementation_in_Array stackImp = new Stack_Implementation_in_Array(10);
		stackImp.pop();
		System.out.println("-------------------------");
		stackImp.push(20);
		stackImp.push(30);
		stackImp.push(40);
		stackImp.push(60);
		stackImp.push(90);
		System.out.println("-------------------------");
        stackImp.peek();
		System.out.println("-------------------------");
		stackImp.pop();
		System.out.println("-------------------------");
        stackImp.peek();   
		
		
	}

}