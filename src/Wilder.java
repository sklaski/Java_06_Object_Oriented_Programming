import java.util.ArrayList;

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

	
	public String whoAmI() {
		String out = "My name is " + firstname + " and I am ";
		if (!this.present) {
			out += "not ";
		}
		out += "present";
		return out;
	}
	
	public boolean isPresent() {
		return this.present;
	}
	
	public void setPresent(boolean present) {
		this.present = present;
	}

	public void setName(String newName) {
		this.firstname = newName;
	}

	public String getName() {
		return this.firstname;
	}
	
}