package collectionFrameWork;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuedemo {

	public static void main(String args[]){  
		Queue<String> queue=new PriorityQueue<String>();  
		queue.add("Sohag");  
		queue.add("Tufayel");  
		queue.add("Orfat"); 
		//to remove specific obj/value-->if not mentioned removes peek 
		queue.remove("Sohag"); //removes Orfat 
		System.out.println("head:"+queue.element()); //print Orfat as peek 
		System.out.println("head:"+queue.peek());  //print Orfat as peek 
		//iterating the queue elements:  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		  
		queue.poll();  //removes Sohag as it inserted last
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}

	}

}
