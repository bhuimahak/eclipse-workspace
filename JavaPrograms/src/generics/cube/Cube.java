package generics.cube;

public class Cube<T extends Number> {
	T side;

	public Cube(T side) {
		this.side = side;
	}

	@SuppressWarnings("unchecked")
	public T volume() {
//		Class<? extends Number> cls = side.getClass();
//		if (cls == Integer.class)
		
		if (side instanceof Integer){
			int value = side.intValue();
			return (T) Integer.valueOf((value * value * value));
		} else if (side instanceof Long) { // if (cls == Long.class)
			Long value = side.longValue();
			return (T) Long.valueOf((value * value * value));
		} else if (side instanceof Float) { // if (cls == Float.class)
			float value = side.floatValue();
			//return (T) Float.valueOf((value * value * value));
			Float result = value*value*value;
			return (T)result;
		} else if (side instanceof Double) {
			Double value = side.doubleValue();
			Double result = value * value* value;
			return (T)result;
		}
		return null;

	}

}
