package collectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UseOfArrayList1 {
/*
 * Author: Shohag
 */
	public static void main(String[] args) {

		// getting new ArrayList -by default contractor-->initial capacity (ic) 10 
		ArrayList ar = new ArrayList();
		ar.add("Shohag"); // index [0]
		ar.add("Tofael");
		ar.add(5); // different data type is allowed, here int is used
		ar.add(""); // null is allowed for String Type
		ar.add("Manir");
		ar.add("Orfat");
		ar.add("Tofael");// duplicate value is allowed
		ar.add("Imran");
		ar.add(5.5); //? type
		ar.add('M'); //char type
		ar.add("Nafasat");
		ar.add(5.5);// ic is [10]-- then capacity will be increased to [ic*(3/2)+1]=16
		
		System.out.println("The size of the ArrayList is: "+ ar.size()+"\n"); //in Array this is length
		
		
		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + ar.get(0)); // output: 
		System.out.println("Single index value: " + ar.get(1)); // output: 
		System.out.println("Single index value: " + ar.get(3)); // output: 
		System.out.println("Single index value: " + ar.get(7)); // output: 
		System.out.println("Single index value: " + ar.get(9)); // output: 
		System.out.println("Single index value: " + ar.get(11)); // output: 
		
		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of ArrayList ^^^^^^^^^^^^^^^^ ");
		// to print all elements (for loop, for each loop, iterator()
				for (int i = 0; i < ar.size(); i++) {
					System.out.println(ar.get(i));
				}
				
				
		/*
		 now ar[] index is 16 capacity when we need to add for 10th index it jvm will
		 create new array with capacity 16 elements of the prev. array will be shifted
		 to new array & old array will be ready for garbage collection
		 */

		
	}
}
