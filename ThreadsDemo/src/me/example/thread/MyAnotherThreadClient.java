package me.example.thread;

/**
 * Client class to demo threads.
 * 
 * @author Chetan
 *
 */
public class MyAnotherThreadClient {

	public static void main(String[] args) throws InterruptedException {
		MyAnotherThread t1 = new MyAnotherThread();
		Thread thread1 = new Thread(t1);
		thread1.start();
		MyAnotherThread t2 = new MyAnotherThread();
		new Thread(t2).start();
		

		// Calling run directly does not create a new thread.
		System.out.println("\n\n\n-------------------");
		MyAnotherThread t3 = new MyAnotherThread();
		new Thread(t3).run();
		MyAnotherThread t4 = new MyAnotherThread();
		new Thread(t4).run();
	}
}
