public class Wilder {

	private String firstname;
	private boolean present;
	
	public Wilder(String firstname) {
		this.firstname = firstname;
	}
	
	public Wilder(String firstname, boolean present) {
		this.firstname = firstname;
		this.present = present;
	}
	
	public void showIfPresent() {
		System.out.print("My name is " + firstname + " and I am ");
		if (!present) {
			System.out.print("not ");
		}
		System.out.println("present");
	}
	
	public void setIfPresent(boolean present) {
		this.present = present;
	}
	
}

	/*   
		// TODO Auto-generated method stub
			
		private String firstname;
		private boolean present;
		
		public Wilder (String firstname) {
			this.firstname = firstname;
			this.present = false;
		}
		
		public Wilder (String firstname, boolean present) {
			this.firstname = firstname;
			this.present = present;
		}
}


 1.Create a Wilder class
 2.Adds the attributes String firstname and boolean present
 3.Create a constructor to initialise firstname and present 
 4.Add getters and setters for all attributes, according to the conventions
 5.Add a whoAmI() method that returns the text "My name is firstname and I am present" or "My name is firstname and I am not present", depending on the state of the attributes firstname and present 
 6.Create a Classroom class with a main() method
 7.Add references to several instances of the Wilder class inside the main() method of Classroom
 8.For each of the references, display the result of the whoAmI() method in the terminal
 9.Compile and test Classroom: once everything is working perfectly, create a git repository and send it all to GitHub
10.Share the link to the GitHub repository as your solution
		
		Example of the expected result when running Classroom:
		My name is Jean-Claude and I am present
		My name is Henri and I'm not present

Validation criteria :

•

Your GitHub repository contains the files Wilder.java and Classroom.java
•

The Wilder class follows OOP conventions: private attributes, using the keyword this, and contains appropriately named getters and setters.
•

References to instances of the Wilder class are present within the Classroom class
•

The Classroom class compiles without throwing any errors and displays the expected result in the terminal.

		*/	