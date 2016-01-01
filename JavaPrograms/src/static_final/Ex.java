package static_final;
public class Ex {

	static final int x;
	final int y;

	public Ex(int i) {
		y = i;
	}

	static {
		x = 10;
	}

	public static void main(String[] args) {
		Ex obj = new Ex(2);
		System.out.println(obj.y);
		//obj.y = 3;
	}

}
