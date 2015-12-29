package mypackage ;

public class Samsung implements Phone {



	@Override
	public void call() {
	System.out.println("Samsung calling");
	
	}

	@Override
	public void switchOff() {
	System.out.println("Samsung Switching off");
	}
	
	public void findLocation(){
	System.out.println("Finding location");
		
	}
	
}

