package multithreading;

public class Multithreading extends Thread {
	private String name;
	private int size;
	
	public Multithreading(String n, int s) {
		this.name = n;
		this.size = s;
	}
	
	public void run() {
		for(int i = 1; i <= size; i++) {
			System.out.println("Name: " + name + ", num: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
