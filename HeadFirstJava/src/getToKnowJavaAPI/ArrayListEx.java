package getToKnowJavaAPI;

import java.util.ArrayList;

public class ArrayListEx {
int x;
String s;
boolean result = false;

	public static void main(String[] args) {
	ArrayListEx obj1 = new ArrayListEx();
	ArrayListEx obj2 = new ArrayListEx();
	ArrayListEx obj7 = new ArrayListEx();
	
	ArrayList<ArrayListEx> myList = new ArrayList<ArrayListEx>();
	System.out.println(myList.size());
	myList.add(obj1);
	System.out.println(myList.size());
	myList.add(obj2);
	System.out.println(myList.size());
	
	System.out.println(myList.contains(obj7));
	
	System.out.println(myList.getClass());
	ArrayListEx obj = myList.get(1);
	obj.x = 1;
	System.out.println(obj2.x);
	
	System.out.println("Index of obj1 is: " + myList.indexOf(obj1));
	
	myList.remove(obj1);
	System.out.println(myList.size());
	
	myList.add(obj1);
	System.out.println("Index of obj1 is now: " + myList.indexOf(obj1));
	
	myList.remove(0);
	System.out.println("Index of obj1 is now: " + myList.indexOf(obj1));
	System.out.println(myList.size());
	System.out.println(myList.contains(obj2));
	
	myList.add(obj2);
	System.out.println("now the final size is: " +myList.size());
	
	myList.remove(1);
	System.out.println(myList.size());
	
	System.out.println(myList.isEmpty());
	myList.remove(0);
	System.out.println(myList.isEmpty());
	}
	

}
