package Thread;

public class ThreadsDemo extends Thread {
	public void run()//override run method
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadsDemo t1=new ThreadsDemo();//created now stored in memory
		ThreadsDemo t2=new ThreadsDemo();
		ThreadsDemo t3=new ThreadsDemo();
		ThreadsDemo t4=new ThreadsDemo();
		t1.start();// no need to override start method
		t2.start();
		t3.start();
		t4.start();
		t1.suspend();
		t1.resume();
		t1.stop();

		System.out.println(t2.getState());
		System.out.println(t1.getState());
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		
		
		
		
		
//		Thread t1;//Thread class
//		Thread t2;
//		//lifecycle of thread
//		t1.start();
//		t1.run();
//		try {
//			t1.wait(101);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		t1.run(); //to run the thread from waiting stage
//		t1.stop(); // 
		 
//		try {
//			t2.wait(10);
//		} catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		t2.start();
//		System.out.println("completed");
//		t2.stop();
		
		
		

	}

}
