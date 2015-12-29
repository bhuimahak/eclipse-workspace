package mypackage;

public class Nokiaphone implements Phone {
	
	@SuppressWarnings("unused")
	private int abcd = 1;

	@Override
	public void call() {
		System.out.println("Nokia calling");
		
	}

	public void switchOff() {
		System.out.println("Nokia Switching off");
		
	}
	
	@SuppressWarnings("unused")
	private void something() {
		//
	}

}
