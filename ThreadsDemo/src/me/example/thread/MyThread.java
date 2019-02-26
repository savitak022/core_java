package me.example.thread;

/**
 * A custom thread.
 * 
 * @author Chetan
 *
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			// Note: Thread name is main when run() is invoked directly as new thread is not
			// created
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}
