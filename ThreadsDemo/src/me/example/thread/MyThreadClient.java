package me.example.thread;

/**
 * Client class to demo threads.
 * 
 * @author Chetan
 *
 */
public class MyThreadClient {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.start();
		MyThread t2 = new MyThread();
		t2.start();

		// Calling run directly does not create a new thread.
		System.out.println("\n\n\n-------------------");
		MyThread t3 = new MyThread();
		t3.run();
		MyThread t4 = new MyThread();
		t4.run();
	}
}
