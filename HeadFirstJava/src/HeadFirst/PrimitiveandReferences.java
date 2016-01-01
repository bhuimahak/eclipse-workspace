package HeadFirst;

public class PrimitiveandReferences {
	 static int counter = 0;
	
	  //static   PrimitiveandReferences pr; //I can't put final keyword here ..why?
	 public PrimitiveandReferences(){
		System.out.println("in the constructor");
		counter++;
		//System.out.println("number of objects are " + counter);
		}
	

	public static void main(String[] args) {
		//System.out.println("started");
		final int x = 1278; //(byte range -127 to 127)
		
		byte y;
		//y = x; //now this works y? I m assigning an int value into byte , if I remove final keyword from int x, it wont work then!why is that?
		final PrimitiveandReferences pr; //why??static variables can't be declared in a method and final vars cant be declared as instance vars unless they are initialised..why?
		int v = 5;
		pr = new PrimitiveandReferences(); //why is this not working?
	//	pr = new PrimitiveandReferences();
		// System.out.println("here");
		 PrimitiveandReferences fr = new PrimitiveandReferences();
		 System.out.println("no of objs: " + counter);
		 //pr = fr;
		 
		

	}

}
