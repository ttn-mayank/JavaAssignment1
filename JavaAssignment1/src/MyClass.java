
public class MyClass {

	static String firstName="mayank";
	static String lastName="Kumar";
	static int age=22;
	
	static {
		System.out.println("Print Variable using Static Block");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
	}
	
	static void getFirstName() {
		System.out.println("First Name : "+firstName);
	}
	
	static void getLastName() {
		System.out.println("last Name : "+lastName);
	}
	
	static void getAge() {
		System.out.println("Age : "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print variable using static function");
		getFirstName();
		getLastName();
		getAge();
		System.out.println("MyClass print All variabes using static variable");
		System.out.println("First Name : "+firstName);
		System.out.println("last Name : "+lastName);
		System.out.println("Age : "+age);
	}

}
