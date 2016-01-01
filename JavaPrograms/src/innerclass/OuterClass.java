package innerclass;

public class OuterClass {
	private int key;
	private PrivateInnerClass inner;
	private StaticInnerClass staticInner;

	public OuterClass(int i) {
		this.key = i;
		this.inner = new PrivateInnerClass(2 * i);
		this.staticInner = new StaticInnerClass(3 * i);
	}

	public int getKey() {
		return key;
	}

	public int getValue() {
		return inner.getValue();
	}

	public int getStaticInnerValue() {
		return staticInner.getValue();
	}

	public PrivateInnerClass getInner() {
		return inner;
	}

	public StaticInnerClass getStaticInner() {
		return staticInner;
	}

	private class PrivateInnerClass {
		private int value;
		public PrivateInnerClass(int i) {
			this.value = i;
		}
		public int getValue() {
			return value;
		}
	}

	public static class StaticInnerClass {
		private int value;

		public StaticInnerClass(int i) {
			this.value = i;
		}

		public int getValue() {
			return value;
		}
	}

	public class InnerClass {
		private int value;

		public InnerClass(int i) {
			this.value = i;
		}

		public int getValue() {
			return value;
		}
	}

}
