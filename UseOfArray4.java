package collectionFrameWork;

public class UseOfArray4 {

	public static void main(String[] args) {
		String [] a = new String[6]; // Different data type (String and int) can't be mix in Array
		a[0] = "Tofael";
		a[1] = "Kabir";
		a[2] = "Sharkar";

		a[5] = "Mohammad";
		// print single index value:
		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + a[0]);// output: 5
		System.out.println("Single index value: " + a[3]);// output: ?
		System.out.println("Single index value: " + a[5]);// output: 56

		System.out.println("\nThe length of the array is: " + a.length);
		System.out.println("\nSingle index value: " + a[a.length-1]); //find the value for (length-1) no.

		// print all index value:

		System.out.println("\n^^^^^^^^^^^^^ Printing all index value of Array a [] ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}