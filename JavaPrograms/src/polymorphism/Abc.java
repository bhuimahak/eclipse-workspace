package polymorphism;

public class Abc extends Xyz {
	
	public void someFun(Dog d){
		System.out.println("In Abc class: someFun(Dog d) method");
	}
	
	/*@Override
	public void someFun(Animal a){
		System.out.println("In Abc class:overriden xyz's someFun(Animal a) method");
	} */

}
