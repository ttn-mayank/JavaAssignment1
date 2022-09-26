
public class Employee {

	private String firstName;
	private String lastName;
	private int age;
	private String designation;
	// All Constructors
	public Employee() {
		
	}
	public Employee(String firstName) {
		this.firstName=firstName;
	}
	public Employee(String firstName,String lastName) {
		this(firstName);
		this.lastName=lastName;
	}
	public Employee(String firstName,String lastName,int age) {
		this(firstName,lastName);
		this.age=age;
	}
	public Employee(String firstName,String lastName,int age,String designation) {
		this(firstName,lastName,age);
		this.designation=designation;
	}
	
	// copy constructor
	
	public Employee(Employee obj) {
		this.firstName = obj.getFirstname();
		this.lastName = obj.getLastname();
	}
	
	// Setter methods
	public void setFirstname(String firstName) {
		this.firstName=firstName;
	}
	public void setLastname(String lastName) {
		this.lastName=lastName;
	}
	public void setAge(String firstName) {
		this.firstName=firstName;
	}
	public void setDesignation (String designation) {
		this.designation=designation;
	}
	// Getter methods
	public String getFirstname() {
		return firstName;
	}
	public String getLastname() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getDesignation() {
		return designation;
	}
	
	@Override
    public String toString() {
        return "First Name: "+firstName+" Last Name: "+lastName+" Age:"+age+" Designation: "+designation;
    }

}
