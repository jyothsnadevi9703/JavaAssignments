package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		HashSet<String> set1=new LinkedHashSet<String>();
		set.add("j");
		set.add("y");
		set.add("o");
		set.add(" ");
		set.add(null);
		
		//set cannot contain 2 same element and only one null value
		//Traversing the elements
		
		Iterator<String> itr=set.iterator();
		Iterator<String> itr1=set1.iterator();		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
