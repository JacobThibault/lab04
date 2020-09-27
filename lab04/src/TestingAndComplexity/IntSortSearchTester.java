package TestingAndComplexity;
import java.util.Arrays;
public class IntSortSearchTester {

	public static void linearSearchTester() {
		// o Array containing one element only, and the value being searched for is the
		// element in the array
		int[] a = new int[1];
		a[0] = 5;
		int x = 5;
		int expectedOutput = 0;
		int actualOutput = IntSortSearch.linearSearch(a, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing one element only, and the value being searched for is NOT
		// the element in the array
		x = 4;
		expectedOutput = 0;
		actualOutput = IntSortSearch.linearSearch(a, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing two unequal elements, and the value being searched for is
		// one of the elements of the array
		int[] b = new int[2];
		b[0] = 3;
		b[1] = 7;
		x = 7;
		expectedOutput = 1;
		actualOutput = IntSortSearch.linearSearch(b, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing two unequal elements, and the value being searched for is
		// NOT ANY of the elements of the array
		x = 9;
		expectedOutput = 1;
		actualOutput = IntSortSearch.linearSearch(b, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the very
		// first element of the array
		int[] c = new int[3];
		c[0] = 12;
		c[1] = 34;
		c[2] = 54;
		x = 12;
		expectedOutput = 0;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the very
		// last element of the array
		x = 54;
		expectedOutput = 2;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the middle
		// element
		x = 34;
		expectedOutput = 1;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing 3 elements, and the value being searched for is NOT ANY of
		// the elements in the array
		x = 93;
		expectedOutput = 2;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput == expectedOutput);
	}

	public static void binarySearchTester() {
		// o Array containing one element only, and the value being searched for is the
		// element in the array
		int[] a = new int[1];
		a[0] = 5;
		int x = 5;
		int expectedOutput = 0;
		int actualOutput = IntSortSearch.linearSearch(a, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing one element only, and the value being searched for is NOT
		// the element in the array
		x = 4;
		expectedOutput = 0;
		actualOutput = IntSortSearch.linearSearch(a, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing two unequal elements, and the value being searched for is
		// one of the elements of the array
		int[] b = new int[2];
		b[0] = 3;
		b[1] = 7;
		x = 7;
		expectedOutput = 1;
		actualOutput = IntSortSearch.linearSearch(b, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing two unequal elements, and the value being searched for is
		// NOT ANY of the elements of the array
		x = 9;
		expectedOutput = 0;
		actualOutput = IntSortSearch.linearSearch(b, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the very
		// first element of the array
		int[] c = new int[3];
		c[0] = 12;
		c[1] = 34;
		c[2] = 54;
		x = 12;
		expectedOutput = 0;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the very
		// last element of the array
		x = 54;
		expectedOutput = 2;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing 3 elements, and the value being searched for is the middle
		// element
		x = 34;
		expectedOutput = 1;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput == expectedOutput);
		// o Array containing 3 elements, and the value being searched for is NOT ANY of
		// the elements in the array
		x = 93;
		expectedOutput = 0;
		actualOutput = IntSortSearch.linearSearch(c, x);
		System.out.println(actualOutput == expectedOutput);
	}

	public static void sortTester() {
		// o Array containing one element only
		System.out.println("SORTER");
		int a[] = new int[1];
		a[0] = 1;
		int[] expectedOutput1 = new int[1];
		int[] actualOutput1 = new int[1];
		expectedOutput1[0] = 1;
		IntSortSearch.selectionSort(a);
		actualOutput1 = a;
		System.out.println(Arrays.equals(actualOutput1, expectedOutput1));
		// o Array containing two unequal elements
		int b[] = new int[2];
		b[0] = 10;
		b[1] = 5;
		int[] expectedOutput2 = new int[2];
		int[] actualOutput2 = new int[2];
		expectedOutput2[0] = 10;
		expectedOutput2[1] = 5;
		IntSortSearch.selectionSort(b);
		actualOutput2 = b;
		System.out.println(Arrays.equals(actualOutput2, expectedOutput2));
		// o Array containing 3 elements, already sorted
		int[] c = new int[3];
		c[0] = 5;
		c[1] = 12;
		c[2] = 95;
		int[] expectedOutput3 = new int[3];
		int[] actualOutput3 = new int[3];
		expectedOutput3[0] = 5;
		expectedOutput3[1] = 12;
		expectedOutput3[2] = 95;
		IntSortSearch.selectionSort(c);
		actualOutput3 = c;
		System.out.println(Arrays.equals(actualOutput3, expectedOutput3));
		// o Array containing 3 elements, already sorted in the reverse order
		int[] d = new int[3];
		d[0] = 95;
		d[1] = 12;
		d[2] = 5;
		expectedOutput3[0] = 95;
		expectedOutput3[1] = 12;
		expectedOutput3[2] = 5;
		IntSortSearch.selectionSort(d);
		actualOutput3 = d;
		System.out.println(Arrays.equals(actualOutput3, expectedOutput3));
		// o Array containing 3 elements, all of them negative
		int[] e = new int[3];
		e[0] = -6;
		e[1] = -23;
		e[2] = -324;
		expectedOutput3[0] = -324;
		expectedOutput3[1] = -23;
		expectedOutput3[2] = -6;
		IntSortSearch.selectionSort(e);
		actualOutput3 = e;
		System.out.println(Arrays.equals(actualOutput3, expectedOutput3));
		// o Array containing 3 elements, one negative, one zero, one positive
		int[] f = new int[3];
		f[0] = -4;
		f[1] = 0;
		f[2] = 5;
		expectedOutput3[0] = 0;
		expectedOutput3[1] = -4;
		expectedOutput3[2] = 5;
		IntSortSearch.selectionSort(f);
		actualOutput3 = f;
		System.out.println(Arrays.equals(actualOutput3, expectedOutput3));
		// o Array containing 3 elements, all of them the same value (like: 5,5,5)
		int[] g = new int[3];
		g[0] = 5;
		g[1] = 5;
		g[2] = 5;
		expectedOutput3[0] = 5;
		expectedOutput3[1] = 5;
		expectedOutput3[2] = 5;
		IntSortSearch.selectionSort(g);
		actualOutput3 = g;
		System.out.println(Arrays.equals(actualOutput3, expectedOutput3));
	}

	public static void main(String[] args) {
		IntSortSearchTester.linearSearchTester();
		IntSortSearchTester.binarySearchTester();
		IntSortSearchTester.sortTester();
	}

}
