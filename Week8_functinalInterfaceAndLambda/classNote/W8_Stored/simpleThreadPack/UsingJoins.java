package simpleThreadPack;

import java.util.Random;

public class UsingJoins implements Runnable {
	Random var = new Random(System.currentTimeMillis());
	public static void main(String[] args) throws InterruptedException {
		Thread[] useofJoins = new Thread[5];
		for (int i = 0; i < useofJoins.length; i++) {
			useofJoins[i] = new Thread(new UsingJoins(), "useOfThread " + i);
			useofJoins[i].start();
		}
//		try cut out below part
		for (int x = 0; x < useofJoins.length; x++) {
			useofJoins[x].join();
		}
//		
		System.out.println(Thread.currentThread().getName() + " Finishing");
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10000000; i++)
			var.nextInt();
		System.out.println(Thread.currentThread().getName() + " Finishing work");
	}
}
