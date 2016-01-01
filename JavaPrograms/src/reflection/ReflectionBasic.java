package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionBasic {
	public static void main(String args[]) {

		System.out.println("Starting...");
		
		SampleClass ref = new SampleClass();

		for(String methodName : args) {
			try {
				Method meth = SampleClass.class.getMethod(methodName, Integer.class);
				meth.invoke(ref, 100);
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Ending...");
	}
}
