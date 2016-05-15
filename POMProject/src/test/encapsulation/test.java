package test.encapsulation;

public class test {

	public static void main(String[] args) {
		// School school = new School();
		Room r = new Room();
		r.setSpace(1000);
		School school = new School(r);
		school.teach();
		System.out.println(school.r.getSpace());
	}

}
