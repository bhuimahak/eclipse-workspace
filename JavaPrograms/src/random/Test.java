package random;

public class Test {
	int i;
	int j;

	public static void main(String[] args) {
		int area = calArea1(3, 4);
		System.out.println(area);
		Test t = new Test();
		area = calArea2(t);
		System.out.println(area);
	}

	public static int calArea1(int i, int j) {
		return i * j;
	}

	public static int calArea2(Test t) {
		t.i = t.i + 10;
		t.j = t.i + 20;
		return t.i * t.j;
	}

}
