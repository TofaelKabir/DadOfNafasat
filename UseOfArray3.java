package collectionFrameWork;

import java.util.Arrays;

public class UseOfArray3 {

	public static void main(String[] args) {
		// Lets start from array
		int [] a = new int[6]; // declaring size of the array
		a[0] = 5;
		a[1] = 15;
		a[2] = 50;

		a[5] = 56;
		// print single index value:

		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + a[0]);// output: 5
		System.out.println("Single index value: " + a[3]);// output: ?
		System.out.println("Single index value: " + a[5]);// output: 56

		System.out.println("\nThe length of the array is: " + a.length);

		// print all index value:

		System.out.println("\n^^^^^^^^^^^^^ Printing all index value of Array a [] ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// we can also update value
		
		a[0] = 55;
		System.out.println("\nAfter update, the value of a[0] is: " + a[0]+"\n");// output:?
		
		
		// copying of another array:
		int [] b = Arrays.copyOf(a, 10); // second argument: declaring size of new array along with old one
		
		
		
		
		
		b[6] = 60;
		b[7] = 65;
		b[8] = 68;
		System.out.println("Single index value for new Array: " + b[0]);// why output is: 55?
		System.out.println("Single index value for new Array: " + b[3]);// output: ?
		System.out.println("Single index value for new Array: " + b[5]);// output: 56
		System.out.println("Single index value for new Array: " + b[7]);// output: 65
		System.out.println("Single index value for new Array: " + b[9]);// output: ?
		System.out.println("\nThe length of the array is: " + b.length);

		// print all index value:

		System.out.println("\n^^^^^^^^^^^^^ Printing all index value of Array b [] ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		int [] c = Arrays.copyOf(b, 12);
		System.out.println("Single index value for new Array: " + c[0]);// why output is: 55?
		System.out.println("Single index value for new Array: " + c[11]);// output: ?
		
	}
}
