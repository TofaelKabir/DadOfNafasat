package collectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// creating map
		Map<String, Integer> map = new HashMap<>();

		// puting key and value
		map.put("Tufayel", 44);
		map.put("Sharif", 42);
		map.put("Sohag", 40);
		map.put("Monir", 46);
		
		System.out.println("Single key's value:");
		System.out.println(map.get("Tufayel"));
		
		//now putting all keys in a set:
		Set<String> keys=map.keySet();
		System.out.println("By using keySet():");
		for(String s:keys) {
		System.out.println(s+"="+map.get(s));
		
			//printing keys' hashcode: 
			//System.out.println("Keys: "+s+" HashCode: "+s.hashCode());
			//keys and their index:
			//System.out.println("Keys: "+s+" Index:"+s.hashCode()%16);
		}
		//put all key&value in an Entry:  (here key&value is a enty set)
		Set<Map.Entry<String, Integer>> es=map.entrySet(); //Entry is a nested Interface of Map Interface		
		System.out.println("By using entrySet():");
		for(Map.Entry<String, Integer> e:es) {
		System.out.println(e);
		}
		}
	}


