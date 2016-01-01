package static_test;

public abstract class AbstractEx {
	
	public static void main(){
		AbstractEx[] ex = new AbstractEx[3]; //so we can make Array object using Abstract class type
		//ex[0] = new AbstractEx(); this will not work
		System.out.println(ex);
	}

}
