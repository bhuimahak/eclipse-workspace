package multithreading;

import java.util.Date;

public class MultithreadingTest {

	public static void main(String[] args) {
		Multithreading t1 = new Multithreading("Arslan", 10);
		Multithreading t2 = new Multithreading("Mahak", 20);
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
