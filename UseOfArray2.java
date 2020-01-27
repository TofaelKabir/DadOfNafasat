package collectionFrameWork;

public class UseOfArray2 {

	public static void main(String[] args) {
		int [] a = new int[6]; // declaring size of the array
		a[0] = 5;
		a[1] = 15;
		a[2] = 50;

		a[5] = 56;
		//adding value in index [6]
		// a[6]=9; //what will happen if we don't comment it out? //Array is fixed in size

		// print single index value:
		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + a[0]);// output: 5
		System.out.println("Single index value: " + a[3]);// output: ?
		System.out.println("Single index value: " + a[5]);// output: 56
		// System.out.println("Single index value: "+a[6]);//output: ?

	}
}