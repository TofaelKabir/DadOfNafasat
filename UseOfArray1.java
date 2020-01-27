package collectionFrameWork;


public class UseOfArray1 {

	public static void main(String[] args) {
		int [] a = new int[6]; // declaring size of the array //learn the role how to write array, list is the array name
		a[0] = 5;
		a[1] = 15;
		a[2] = 50;

		a[5] = 56;
		// print single index value:
		System.out.println("Printing single index value: " + a[0]);// output: 5
		System.out.println("Printing single index value: " + a[3]);// output: 5
		System.out.println("Printing single index value: " + a[5]);// output: 5
		System.out.println("\nThe length of the array is: " + a.length);
		System.out.println("\nPrinting single index value: " + a[a.length-1]); //find the value for (length-1) no.
	}
}