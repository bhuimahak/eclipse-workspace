package generics.method;
//Comparable interface implementation example

public class Cuboid implements Comparable<Cuboid> {   // T implements Comparable<T>

	private int length;
	private int breadth;
	private int height;

	public Cuboid(int l, int b, int h) {
		this.length = l;
		this.breadth = b;
		this.height = h;
	}

	public int getVolume() {
		int volume = length * breadth * height;
		return volume;
	}

	public int getArea() {
		int area = 2 * (length * breadth + breadth * height + length * height);
		return area;
	}

	public int compareTo(Cuboid c) {
		if(this.getVolume()-c.getVolume()>0){
			return 1;
		}
		else if(this.getVolume() == c.getVolume()){
			return 0;
		}
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Cuboid [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
	}

}
