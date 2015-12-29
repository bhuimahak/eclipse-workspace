package mypackage;

public class PassByValueOrPassByReference {
	int x;
	int y;

	public static void main(String[] args) {
		PassByValueOrPassByReference obj = new PassByValueOrPassByReference();
		obj.x = 1;
		obj.y = 2;
		swap(obj.x,obj.y);
		System.out.println("value of x for obj : " +obj.x + " value of y: " +obj.y);
		swap(obj);
		System.out.println("value of x: " +obj.x + " value of y: " +obj.y);
	}

	//pass by value
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	//pass by reference
	public static void swap(PassByValueOrPassByReference p) {
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
	}
}
