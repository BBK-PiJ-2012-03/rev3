public interface ListGen<T> {
	//adds an element to the list
	void add(T newElement);
	
	//takes an array of elements and converts it into a list
	ListGen<T> array2List(T[] myArray);
	
	//prints
	void print();
}	
	
