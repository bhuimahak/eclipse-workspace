package innerclass;

public class OuterClassTester {
	public static void main(String[] args) {
		OuterClass sam = new OuterClass(5);
		System.out.println(sam.getKey());
		System.out.println(sam.getValue());
		
//		OuterClass.PrivateInnerClass inn = sam.getInner();
		System.out.println(sam.getInner());
//		System.out.println(sam.getInner().getValue());
		
		OuterClass.StaticInnerClass sinn = sam.getStaticInner();
		System.out.println(sinn.getValue());
		
//		OuterClass.StaticInnerClass sin = new OuterClass.StaticInnerClass(20);
//		System.out.println(sin.getValue());
		
		OuterClass.InnerClass in = sam.new InnerClass(25);
		//OuterClass.InnerClass in =  new OuterClass.InnerClass(25);//wont work as we  need object to acccess the inner class which is non static
		System.out.println(in.getValue());
		
//		PublicClass pub = PublicClass.getInstance();
	}
}
