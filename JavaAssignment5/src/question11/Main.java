/**
 * 
 */
package question11;

/**
 * @author mayank
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("Abhishek Garg",1,22);
        Student student2=new Student("Tarun Singh",2,22);
        Student student3=new Student("Abhishek Garg",1,22);
        System.out.println(Student.count);
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
	}

}
