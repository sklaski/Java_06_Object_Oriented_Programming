public class Classroom {

	public static void main(String[] args) {
		Wilder person1 = new Wilder("Steffen", true);
		person1.setIfPresent(false);
		person1.showIfPresent();
		Wilder person2 = new Wilder("Arne");
		person2.setIfPresent(true);
		person2.showIfPresent();
	}

}
