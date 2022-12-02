package ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LinkedList llist=new LinkedList();
//		LinkedList<Float> llist=new LinkedList<Float>(); //for float value
//		LinkedList<String> llist=new LinkedList<String>();//for string values

		LinkedList<Myclass> llist=new LinkedList<Myclass>();
		Myclass m1=new Myclass();
		Myclass m2=new Myclass();
		llist.add(m1);
		llist.add(m2);
		llist.add(m1);//allow duplicates
		

		

		

//		llist.add("linked  list");//for list values
//		llist.add(1);
//		llist.add('5');
//		llist.add(1); //Allow dulicates
//		llist.add(89.2f);
		
		
//		llist.add(8.0f);//for float values
//		llist.add(9.2f);
//		llist.add(89.67f);

		
		
		Iterator itr=llist.iterator();
		while (itr.hasNext())
		{
//			System.out.println(itr.next());
			System.out.println(itr.next().toString());
			
		}


		

	}

}
