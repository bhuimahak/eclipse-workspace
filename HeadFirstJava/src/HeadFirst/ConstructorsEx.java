package HeadFirst;

public class ConstructorsEx {
	private int size ;
	private String name;
	boolean isSomething;
	
	public ConstructorsEx(){
		System.out.println("I am in the default constructor");
		this.size = 1;
		this.name = "default";
		this.isSomething = true;
				
	}
	
	public ConstructorsEx(int size, String name){
		System.out.println("I am in the second constructor");
		this.size = size;
		this.name = name;
	} 

	public static void main(String[] args) {
		ConstructorsEx cx = new ConstructorsEx();
		System.out.println("Size of cx is: "+ cx.size + " and name is " + cx.name + " isSomething is:" +cx.isSomething);
        ConstructorsEx cx1 = new ConstructorsEx(4,"secondConstructor");
        System.out.println(cx1.size + " " + cx1.name + " " +cx1.isSomething);
        
	}

}
