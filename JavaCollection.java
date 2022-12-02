package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class JavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create one object of rraylist class
		ArrayList<String> a1=new ArrayList<String>();
		ArrayList<Integer> a11=new ArrayList<Integer>();
		a1.add("jyo");
		a1.add("shivi");
		a1.add("shivani");
		a1.add("jyothsna");
		a11.add(9);
		a11.add(3);
		a11.add(8);
		
		//printing the values in sorted fashion
		//collection Interface method
		//Collection Interface method
		//Interface you cannot create objects
		//interface.method
		
		Collections.sort(a1,Collections.reverseOrder());
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Collections.sort(a11,Collections.reverseOrder());
		Iterator<Integer> itr1=a11.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		

	}

}
