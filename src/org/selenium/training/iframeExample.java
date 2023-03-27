package org.selenium.training;

import java.util.*;
import java.util.Map.Entry;

public class iframeExample {
	public static void main(String[] args) {
		Map<Integer,String> m = new TreeMap<>();
		m.put(1,"anbu");
		m.put(2, "guna");
		m.put(3, "rajan");
		m.put(4, "andrea");
		
		
		
		Iterator<Entry<Integer, String>> iterator = m.entrySet().iterator();
		
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
	/*	while (iterator.hasNext()) {
			
			Entry<Integer, String> next = iterator.next();
			System.out.println(next);
			
		}
		
		
		*/

	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Map<Integer, String> hm = new LinkedHashMap<Integer, String>();
		 * hm.put(110,"Ravi"); hm.put(120,"Prateek"); hm.put(130, "Davesh"); hm.put(140,
		 * "Kamal"); hm.put(150, "Pawan"); Iterator <Integer> it =
		 * hm.keySet().iterator(); while (it.hasNext()) { Integer key = it.next();
		 * System.out.println(key + " "); } // Collection<String> values = hm.values();
		 * Collection<String> values2 = hm.values(); List<String> li = new
		 * ArrayList(values2); ListIterator<String> listIterator = li.listIterator(); //
		 * System.out.println(li); while (listIterator.hasNext()) { String value =
		 * listIterator.next(); // System.out.println(value + " " ); } while
		 * (listIterator.hasPrevious()) { String value1 = listIterator.previous();
		 * System.out.println(value1 + " " ); } }
		 */
	}
