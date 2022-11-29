package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoJavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create one object of arraylist class
		ArrayList list=new ArrayList();
		Thread t1=new Thread();
		list.add("Database");
		list.add(5);
		list.add('y');
		list.add(78.9f);
		list.add(t1);
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
