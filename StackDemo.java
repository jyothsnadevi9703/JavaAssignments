package ArrayList;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> s1=new Stack<String>();
s1.push("rose");
s1.push("lotus");
s1.push("lilly");
s1.pop();
System.out.println(s1.search("rose")); // shows the reverse indexing value in stack
System.out.println("The peeked element is:"+s1.peek());

Iterator itr=s1.iterator();
while (itr.hasNext())
{
	System.out.println(itr.next());
}


	}

}
