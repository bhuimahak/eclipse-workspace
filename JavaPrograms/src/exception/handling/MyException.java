package exception.handling;

public class MyException extends Throwable {
	private static final long serialVersionUID = 4765109295933366713L;
	
	public MyException(String message) {
		super(message);
	}
	
	public MyException(String message, Throwable t) {
		super(message, t);
	}
	
	public MyException(Throwable t) {
		super(t);
	}
}
