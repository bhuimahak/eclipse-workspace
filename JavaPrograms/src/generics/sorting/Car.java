package generics.sorting;

public class Car implements Comparable<Car>{
	
	private int year;
	private String model;
	
	
	public Car(int year, String model){
		this.year = year;
		this.model = model;
	}
	
	public int getyear(){
		return year;
	}
	
	public String getModel(){
		return model;
	}

	@Override
	public int compareTo(Car o) {
		if (this.year > o.year){
			return 1;
		} 
		else if(this.year < o.year){
			return -1;
		}
		else 
			return 0;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", model=" + model + "]";
	}

}
