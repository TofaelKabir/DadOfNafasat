package collectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String args[]){  
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Sohag");  
		set.add("Tufayel");  
		set.add("Orfat");  
		set.add("Sharif");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  

	}
	}
}
