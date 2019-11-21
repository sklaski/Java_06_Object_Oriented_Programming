public class Classroom {

	public static void main(String[] args) {
		Wilder person1 = new Wilder("Steffen", true);
		Wilder person2 = new Wilder("Arne");
		Wilder person3 = new Wilder("Metje", false);
		person1.setIfPresent(false);
		person2.setIfPresent(true);
		person1.whoAmI();
		person2.whoAmI();
		person3.whoAmI();
		System.out.println(new Wilder("Ralf", false));
//		System.out.println("number of elements: " + person2.getCounter());
	}

}
