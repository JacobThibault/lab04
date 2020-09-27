package TestingAndComplexity;

public class IntSortSearchTester {

	public static void linearSearchTester() {
		// o Array containing one element only, and the value being searched for is the
		// element in the array
		int[] a = new int[1];
		a[0] = 5;
		int x = 5;
		int expectedOutput = 5;
		int actualOutput = IntSortSearch.linearSearch(a, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing one element only, and the value being searched for is NOT
		// the element in the array
		x = 4;
		expectedOutput = 4;
		actualOutput = IntSortSearch.linearSearch(a, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing two unequal elements, and the value being searched for is
		// one of the elements of the array
		int[] b = new int[2];
		b[0] = 3;
		b[1] = 7;
		x = 7;
		expectedOutput = 7;
		actualOutput = IntSortSearch.linearSearch(b, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing two unequal elements, and the value being searched for is
		// NOT ANY of the elements of the array
		x = 9;
		expectedOutput = 9;
		actualOutput = IntSortSearch.linearSearch(b, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the very
		// first element of the array
		int[] c = new int[3];
		c[0] = 12;
		c[1] = 34;
		c[2] = 54;
		x = 12;
		expectedOutput = 12;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the very
		// last element of the array
		x = 54;
		expectedOutput = 54;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the middle
		// element
		x = 34;
		expectedOutput = 34;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing 3 elements, and the value being searched for is NOT ANY of
		// the elements in the array
		x = 93;
		expectedOutput = 93;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput = expectedOutput);
	}

	public static void binarySearchTester() {
		// o Array containing one element only, and the value being searched for is the
		// element in the array
		int[] a = new int[1];
		a[0] = 5;
		int x = 5;
		int expectedOutput = 5;
		int actualOutput = IntSortSearch.linearSearch(a, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing one element only, and the value being searched for is NOT
		// the element in the array
		x = 4;
		expectedOutput = 4;
		actualOutput = IntSortSearch.linearSearch(a, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing two unequal elements, and the value being searched for is
		// one of the elements of the array
		int[] b = new int[2];
		b[0] = 3;
		b[1] = 7;
		x = 7;
		expectedOutput = 7;
		actualOutput = IntSortSearch.linearSearch(b, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing two unequal elements, and the value being searched for is
		// NOT ANY of the elements of the array
		x = 9;
		expectedOutput = 9;
		actualOutput = IntSortSearch.linearSearch(b, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the very
		// first element of the array
		int[] c = new int[3];
		c[0] = 12;
		c[1] = 34;
		c[2] = 54;
		x = 12;
		expectedOutput = 12;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the very
		// last element of the array
		x = 54;
		expectedOutput = 54;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the middle
		// element
		x = 34;
		expectedOutput = 34;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput = expectedOutput);
		// o Array containing 3 elements, and the value being searched for is NOT ANY of
		// the elements in the array
		x = 93;
		expectedOutput = 93;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput = expectedOutput);
	}

	public static void sortTester() {
		// o Array containing one element only
		int a[] = new int[1];
		a[0] = 1;
		int[] expectedOutput = new int[3];
		int[] actualOutput = new int[3];
		expectedOutput[0] = 1;
		IntSortSearch.selectionSort(a);
		actualOutput = a;
		System.out.println(a = expectedOutput);
		// o Array containing two unequal elements
		int b[] = new int[2];
		b[0] = 10;
		b[1] = 5;
		expectedOutput[0] = 10;
		expectedOutput[1] = 5;
		IntSortSearch.selectionSort(b);
		actualOutput = b;
		System.out.println(b = expectedOutput);
		// o Array containing 3 elements, already sorted
		int[] c = new int[3];
		c[0] = 5;
		c[1] = 12;
		c[2] = 95;
		expectedOutput[0] = 5;
		expectedOutput[1] = 12;
		expectedOutput[2] = 95;
		IntSortSearch.selectionSort(c);
		actualOutput = c;
		System.out.println(c = expectedOutput);
		// o Array containing 3 elements, already sorted in the reverse order
		int[] d = new int[3];
		d[0] = 95;
		d[1] = 12;
		d[2] = 5;
		expectedOutput[0] = 95;
		expectedOutput[1] = 12;
		expectedOutput[2] = 5;
		IntSortSearch.selectionSort(d);
		actualOutput = d;
		System.out.println(d = expectedOutput);
		// o Array containing 3 elements, all of them negative
		int[] e = new int[3];
		e[0] = -6;
		e[1] = -23;
		e[2] = -324;
		expectedOutput[0] = -324;
		expectedOutput[1] = -23;
		expectedOutput[2] = -6;
		IntSortSearch.selectionSort(e);
		actualOutput = e;
		System.out.println(e = expectedOutput);
		// o Array containing 3 elements, one negative, one zero, one positive
		int[] f = new int[3];
		f[0] = -4;
		f[1] = 0;
		f[2] = 5;
		expectedOutput[0] = 0;
		expectedOutput[1] = -4;
		expectedOutput[2] = 5;
		IntSortSearch.selectionSort(f);
		actualOutput = f;
		System.out.println(f = expectedOutput);
		// o Array containing 3 elements, all of them the same value (like: 5,5,5)
		int[] g = new int[3];
		g[0] = 5;
		g[1] = 5;
		g[2] = 5;
		expectedOutput[0] = 5;
		expectedOutput[1] = 5;
		expectedOutput[2] = 5;
		IntSortSearch.selectionSort(g);
		actualOutput = g;
		System.out.println(g = expectedOutput);
	}

	public static void main(String[] args) {
		IntSortSearchTester.linearSearchTester();
		IntSortSearchTester.binarySearchTester();
		IntSortSearchTester.sortTester();
	}

}
