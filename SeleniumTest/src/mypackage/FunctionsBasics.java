package mypackage;

public class FunctionsBasics {
	
	private int i;
	private String s;
	
	//getter
	public int geti(){
		return i;
	}
	
	//setter
	public void seti(int j){
		i = j;
	}
	//non static method
	public  void testMe(){
		System.out.println("in test");
	}
	

	//static method
	public static void main(String[] args) {
		int sum= 0;
		System.out.println("in main");
		FunctionsBasics fb = new FunctionsBasics();
		fb.testMe();
		fb.seti(2);
		System.out.println(fb.geti());
	}
	
	

}
