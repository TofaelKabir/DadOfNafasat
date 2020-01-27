package collectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String args[]) {
		Vector<String> v = new Vector<String>();
		v.add("Sohag");// Adding add(Object obj)
		v.add("Orfat");
		//v.clear();// remove all elements so far added until this line
		v.add(0, "Monir");// adding element by using add(int index, Object obj)
		// to print all by using iterator()
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// creating ArrayList to have more element (to use addAll(Collection c) )
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Farhana");
		arr.add("A");
		arr.add("B");
//		//using addAll(Collection c)
		v.addAll(arr);
		//addAll(int index, Collection c)--> we can use to specify the index to add arr
		v.addAll(1,arr);
		System.out.println("After using addAll(): ");
	    Iterator<String> itr1=v.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());
		}
		
		//to use clone()-->creating new vector obj
		Vector <String>v1=new Vector<String>();
		v1=(Vector)v.clone();
		System.out.println("Clone copy:"+v1);
		
		v.add("sharif");
		//using contains()
		System.out.println(v.contains("A"));
		System.out.println(v.indexOf("sharif"));
		
		System.out.println("After adding sharif(): ");
	    Iterator<String> itr3=v.iterator();  
		while(itr3.hasNext()){  
		System.out.println(itr3.next());
		}
	}
}
