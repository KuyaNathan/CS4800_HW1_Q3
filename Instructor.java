public class Instructor {
	private String firstName;
	private String lastName;
	private String officeNumber;

	public Instructor(String first, String last, String office){
		this.firstName = first;
		this.lastName = last;
		this.officeNumber = office;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String first){
		firstName = first;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLastName(String last){
		lastName = last;
	}
	
	public String getOfficeNum(){
		return officeNumber;
	}

	public void setOfficeNum(String office){
		officeNumber = office;
	}
}
