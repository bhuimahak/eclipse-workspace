package interface_sample;

public class ConLib1 implements InterfaceEx {

	Lib1 libone;
	//Lib1 libone = new Lib1();we can declare it like this also, instead of puttin it in the constructor--whats the difference?
	
	public ConLib1(){ //Ask this? y we r creating object here of Lib1 class?I dint understand????????
	libone = new Lib1();	
	}
	
	
	
	@Override
	public void taskA() {
		libone.doA();
		System.out.println("taskA method conLib1 class");
		
	}

	@Override
	public void taskB() {
		libone.doB();
		System.out.println("taskB method conLib1 class");
		
	}

	@Override
	public void taskC() {
		libone.doC();
		System.out.println("taskC method conLib1 class");
		
	}

	@Override
	public void taskD() {
		libone.doD();
		System.out.println("taskD method conLib1 class");
		
	}
	

}
