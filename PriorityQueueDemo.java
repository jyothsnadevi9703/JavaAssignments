package ArrayList;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pqueue=new PriorityQueue<String>();
		pqueue.add("pegion");
		pqueue.add("peacock");
		pqueue.add("parrot");
		pqueue.add("crow");
		System.out.println(pqueue.poll());
		System.out.println("The first /head element is:"+pqueue.peek());
		
		

	}

}
