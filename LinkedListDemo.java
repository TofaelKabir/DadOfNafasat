package collectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Sohag");  
		al.add("Orfat");  
		al.add("Sharif");
		al.addFirst("Rahman");
		al.addLast("Farhana");
		al.set(0, "Tufayel");
		al.remove(1);
		al.removeFirst();
		//al.removeLast();
		System.out.println(al.size());
		int num=0;
		while(al.size()>num) {	
			System.out.println(al.get(num));
		num++;
		
		}
		
//		Iterator<String> itr=al.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next()); 
//		}
		
		System.out.println(al.get(0));
		

	}

}
