package stack;

//ObjectStack will borrow some methods from LinkedList class

public class ObjectStack extends linkedList implements stack {
	// Number of elements in the stack
	private int size;

	// Constructor
	public ObjectStack() {
		// Calls constructor from superclass
		super();
	}

	// push: use insertFront to implement push
	public void push(Object myData) {
		size++;
		insertFront(myData);
	}

	// pop: use removeFront to implement pop
	// before removing, check for empty stack
	public Object pop() throws EmptyStackException {
		if (!isEmpty()) {
			size--;
			return removeFirstObject();
		} else {
			return null;
		}
	}

	// top: use getHead() to implement top
	// check for empty stack
	public Object top() throws EmptyStackException {
		if (!isEmpty()) {
			return getHead();
		} else {
			return null;
		}
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else
			return false;
	}

	public int size() {

		return size;
	}
}