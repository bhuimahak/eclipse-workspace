package interface_sample;

public class MyClass {
	InterfaceEx liby;
	
	public MyClass(InterfaceEx e) {
		this.liby = e;
	}
	
	public void myMethod1(){
		liby.taskA();
		liby.taskB();
		liby.taskD();
	}
	
	public void myMethod2(){
		liby.taskC();
		liby.taskD();
	}
}
