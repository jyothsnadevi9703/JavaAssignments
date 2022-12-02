package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hashmap is a class which implements Map interface
		HashMap map1=new HashMap();
		HashMap map2=new HashMap();
		//add elements to map object
		map1.put(1, "cricket");
		map1.put(2, "hockey");
		map1.put(3, "tennies");
		map1.put(4, "volleyball");
		map1.put("jyo", "devi");
		map1.put(1, "cricket");
		map1.put(6.4f, "jyothsna");
		map2.put("Shivani", "singh");

		//For traversing map we have to use set
//		System.out.println(map1);
//		Set set=map1.entrySet();
//		Iterator itr=set.iterator();
//		while(itr.hasNext())
//		{
//			Map.Entry entry=(Map.Entry)itr.next();
//			System.out.println(entry.getkey()+" "+entry.getValue());
//		}
		System.out.println(map1.containsKey(4));
		System.out.println(map1.containsValue("trowball"));
		System.out.println(map1.clone());
//		System.out.println(map1.putAll(map2));


	}

}
