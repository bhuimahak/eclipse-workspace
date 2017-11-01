package multithreading;

import java.util.Date;

public class MultithreadingRunnableTest {

	public static void main(String[] args) {
		Runnable mt1 = new MultithreadingRunnable("Arslan", 10);
		Runnable mt2 = new MultithreadingRunnable("Mahak", 20);
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		
		Date startDate = new Date();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Date endDate = new Date();
		System.out.println("Total Time Spent: "
				+ (endDate.getTime() - startDate.getTime()));
	}
}
