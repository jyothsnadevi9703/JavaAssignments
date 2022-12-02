package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoJavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create one object of arraylist class
//		ArrayList<String> list=new ArrayList();
		ArrayList<Integer> list=new ArrayList<Integer>();

//		Thread t1=new Thread();
//		list.add("Database");
//		list.add("Oracle");
//		list.add("sql");
//		list.add("mango db");
		
		list.add(1);
		list.add(2);
		list.add(7);
		list.add(4);
		list.add(4,null);// works on indexing
		System.out.println(list.isEmpty());
		System.out.println(list.contains(3));
		list.remove(3);
//		list.remove(null);
		
		//traversing the list through iterators
		Iterator itr=list.iterator();
		//can't use for loop and get(index)method because there is no functionality of single datatype list
		//can use only iterator method for every datatype of an array
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
