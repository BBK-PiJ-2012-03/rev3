public class ListScript {
	public static void main(String[] args) {
		ListScript script = new ListScript();
		script.launch();
	}

	public void launch() {
		ListGenImpl<Integer> myList = new ListGenImpl<Integer>();
		Integer[] myArray = {1,2,3,4,5};
		
		myList.array2List(myArray);
		System.out.println(myList.head.getValue());
	}
}	