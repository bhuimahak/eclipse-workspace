package interface_sample;

public class ConLib2 implements InterfaceEx {
	
	Lib2 libtwo = new Lib2();

	@Override
	public void taskA() {
		libtwo.perfA();
		System.out.println("taskA method conLib2 class");
		
	}

	@Override
	public void taskB() {
		libtwo.perfB();
		System.out.println("taskB method conLib2 class");
		
	}

	@Override
	public void taskC() {
		libtwo.perfC();
		System.out.println("taskC method conLib2 class");
		
	}

	@Override
	public void taskD() {
		libtwo.perfD();
		System.out.println("taskD method conLib2 class");
		
	}

}
