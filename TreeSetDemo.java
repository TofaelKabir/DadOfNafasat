package collectionFrameWork;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main(String args[]){  
		//Creating and adding elements  
		TreeSet<String> set=new TreeSet<String>();  
		set.add("a");  
		set.add("b");  
		set.add("c");  
		set.add("d"); 
		set.add("d"); // no duplicate allowed
		
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}

	}

}
