package collectionFrameWork;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("Sohag");  
		stack.add("Sharif");  
		stack.push("Orfat");
		//Print 
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		}
		//to check the position
		System.out.println(stack.search("Sohag"));
		//to find the peek element as per LIFO
		System.out.println("Find the element using peek():"+stack.peek());//orfat
		//poping out peek element and find the latest peek element
		stack.pop();
		Iterator<String> itr1=stack.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next()); 
		}
		System.out.println("Find the element after using pop() then peek():"+stack.peek());
		//popping out all elements and check stack is empty or not
		stack.pop();
		stack.pop();
		//check is stack empty or not
		System.out.println("It will returns true because no element in our stack: "+stack.empty());
		//check is there any peek
		System.out.println("Find the element after using final pop() then peek():"+stack.peek());
	
}
}
