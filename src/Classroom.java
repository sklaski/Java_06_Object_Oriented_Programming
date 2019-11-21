public class Classroom {

	public static void main(String[] args) {
		//some creates
		Wilder person1 = new Wilder("Steffen", true);
		Wilder person2 = new Wilder("Arne");
		Wilder person3 = new Wilder("Metje", false);
		
		//present settings/changes
		person1.setPresent(false);
		person2.setPresent(true);
		
		System.out.println(person3.whoAmI()); //whoamI
		person3.setName("Stefi"); //name correction
		
		//more whoamI's
		System.out.println(person1.whoAmI());
		System.out.println(person2.whoAmI());
		System.out.println(person3.getName()); //get only name
		
		//isPresent? start
		System.out.print("Steffen is "); 
		if (!person1.isPresent()) {
			System.out.print("not ");
		}
		System.out.println("present!");
		//isPresent? end
		
		System.out.println(new Wilder("Ralf", false)); //useless address!?
		
	}

}
