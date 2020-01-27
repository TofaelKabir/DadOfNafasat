package collectionFrameWork;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class NonSynHashMap implements Runnable{
	/*Problem Description:To check map size (is it equal to method's invoking times/frequency or not)
	 *Steps: 1.implements Runnable Interface  2. Create a map 
	 *3. override run(): Here we program our plan->get thread's name and use it as our map key and value
	 *                   ->use a for loop for looping 10 times to increase our map size
	 *                   ->map size should be 50xnumber of threads we use->10x5=150
	 *4. in main method: ->create the obj of the class so that we can pass it when Thread will be created
	 *                    and we can get access of map variable to print size of the map
	 *5.using start() to start thread to invoke run()
	 *6.using join() to ensure main thread waits until other threads join*/
	
	Map<String,String> map=Collections.synchronizedMap(new HashMap<>());
	public void run() {
		//System.out.println(Thread.currentThread().getName());
		String s=Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			map.put(s+i, s+i);
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		NonSynHashMap n=new NonSynHashMap();
		
		Thread t1=new Thread(n);
		Thread t2=new Thread(n);
		Thread t3=new Thread(n);
		Thread t4=new Thread(n);
		Thread t5=new Thread(n);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
        System.out.println("size: "+n.map.size());
       // System.out.println("map"+n.map);
        
	}

	

}
