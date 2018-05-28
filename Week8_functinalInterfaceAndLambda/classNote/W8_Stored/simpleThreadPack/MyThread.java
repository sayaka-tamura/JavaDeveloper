package simpleThreadPack;

public class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
		
		System.out.println(Thread.currentThread().getState());
	}
	
	public static void main(String[] args) {
		MyThread t = new MyThread("MeThread");
		t.start();
	}

}
