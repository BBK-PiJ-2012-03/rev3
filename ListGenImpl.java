public class ListGenImpl<T> implements ListGen<T> {
	Node<T> head;
	
	public ListGenImpl() {
		head = null;
	}

	public void add(T newElement) {
		Node<T> newNode = new Node(newElement);
		
		if (head == null) {
			head = newNode;
		}
		else {
				Node<T> current = head;
				while (current.getNext()!= null) {
					current = current.getNext();
				}
				current.setNext(newNode);
			}
	}
	
	public ListGenImpl<T> array2List(T[] myArray) {
		ListGenImpl<T> myList = new ListGenImpl();
		
		for(int i = 0; i < myArray.length; i++) {
			Node<T> temp = new Node(myArray[i]);
			myList.add(temp.getValue());
		}
		return myList;
	}	
	
	public void print() {
		/**do { System.out.println(this.head.getValue());
			this.head = head.getNext();
			}
			while (head.getNext() !=null);
	}		
	*/
}	
		