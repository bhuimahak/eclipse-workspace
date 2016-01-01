package generics.custom.classes;

public class Box<T> {
 private T t;
 
 
 public void add(T t){
	 this.t = t;
 }
 
 public T get(){
	 return t;
 }
 
 
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<>();
		Box<String> stringBox = new Box<>();
		integerBox.add(new Integer(2));
		stringBox.add("hello");
		
		System.out.println(integerBox.get());
		System.out.println(stringBox.get());

	}

}
