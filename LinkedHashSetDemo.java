package collectionFrameWork;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String args[]){  
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("a");  
		set.add("b");  
		set.add("c");  
		set.add("d");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  


	}

}
}