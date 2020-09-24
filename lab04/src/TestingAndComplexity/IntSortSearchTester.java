package TestingAndComplexity;

public class IntSortSearchTester {

	public static void linearSearchTester() {
		int[] a = new int[1];
		a[0] = 5;
		int x = 5;
		//o	Array containing one element only, and the value being searched for is the element in the array
		
		//o	Array containing one element only, and the value being searched for is NOT the element in the array
		//o	Array containing two unequal elements, and the value being searched for is one of the elements of the array
		//o	Array containing two unequal elements, and the value being searched for is NOT ANY of the elements of the array
		//o	Array containing 3 elements, and the value being searched for is the very first element of the array
		//o	Array containing 3 elements, and the value being searched for is the very last element of the array
		//o	Array containing 3 elements, and the value being searched for is the middle element
		//o	Array containing 3 elements, and the value being searched for is NOT ANY of the elements in the array
		
	}
	
	public static void binarySearchTester() {
		//o	Array containing one element only, and the value being searched for is the element in the array
				//o	Array containing one element only, and the value being searched for is NOT the element in the array
				//o	Array containing two unequal elements, and the value being searched for is one of the elements of the array
				//o	Array containing two unequal elements, and the value being searched for is NOT ANY of the elements of the array
				//o	Array containing 3 elements, and the value being searched for is the very first element of the array
				//o	Array containing 3 elements, and the value being searched for is the very last element of the array
				//o	Array containing 3 elements, and the value being searched for is the middle element
				//o	Array containing 3 elements, and the value being searched for is NOT ANY of the elements in the array
	}
	
	public static void sortTester() {
		//o	Array containing one element only
		//o	Array containing two unequal elements
		//o	Array containing 3 elements, already sorted
		//o	Array containing 3 elements, already sorted in the reverse order
		//o	Array containing 3 elements, all of them negative
		//o	Array containing 3 elements, one negative, one zero, one positive
		//o	Array containing 3 elements, all of them the same value (like: 5,5,5)

	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSortSearchTester.linearSearchTester();
		IntSortSearchTester.binarySearchTester();
		IntSortSearchTester.sortTester();
	}

}
