public class Node<T> {
	private T value;
	private Node<T> next;
	
	public Node(T value) {
		this.value = value;
		this.next = null;
	}

	public T getValue() {
		return value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> newNode) {
		this.next = newNode;
	}
}	