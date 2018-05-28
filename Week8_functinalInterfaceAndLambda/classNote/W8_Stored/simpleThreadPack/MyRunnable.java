package simpleThreadPack;

import java.lang.Thread.State;

public class MyRunnable implements Runnable {
	
	private Integer counter = 0;
	public static void main(String[] args) {
		MyRunnable myRunObj = new MyRunnable();
		Thread myT = new Thread(myRunObj, "NameOf Thread");
		
		Thread myT2 = new Thread(myRunObj, "NameOf 2 ");
		int c = 0;
		myT.start(); //start run()
		if(Thread.currentThread().getState().equals(State.TERMINATED)) {
			for(int i = 0; i <= 1000000; i++) {
				
			}
			myT2.start(); //start run()
		}
		
		System.out.println(" Finish not" + ++c);
		
		System.out.println(Thread.currentThread().getName() + " Finish");
		
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is Running");
		
		System.out.println(Thread.currentThread().getState()); //Runnable
		System.out.println(Thread.currentThread().getName() + " " +counter);
		counter++;
		System.out.println(Thread.currentThread().getName() + " " +counter);
	}

}
